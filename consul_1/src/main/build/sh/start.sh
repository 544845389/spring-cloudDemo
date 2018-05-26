#!/bin/sh

# 容器名
psname=service_one
# 要下载镜像的版本
version=1.0.0
#阿里云仓库
aliDocker=registry.cn-hangzhou.aliyuncs.com/centos_houcunlu
# 容器端口
cport=18091
# 宿主机端口
sport=18091


# 容器停止，删除
psid=`docker ps -a --no-trunc --filter name=$psname|awk '{print $1}'`

if [ ! -n "$psid" ]; then
   echo $psname "is null"
else
	docker stop $psid
    docker rm $psid
fi

# 镜像删除，下载
imagesname=$aliDocker'/'$psname
imagesid=`docker images|grep -i $imagesname|awk '{print $3}'`

if [ ! -n "$imagesid" ]; then
   echo $imagesname "is null"
else
	docker rmi -f $imagesid
fi

docker pull $aliDocker/$psname:$version

docker run -it -d -p $sport:$cport --net=server  --name $psname $aliDocker/$psname:$version

echo '>>>>>>>>>> Success <<<<<<<<<<'