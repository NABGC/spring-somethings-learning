**spring somethings learning**

**Kubernetes 中文指南/云原生应用架构实践手册**
https://jimmysong.io/kubernetes-handbook

**Kubernetes指南**
https://kubernetes.feisky.xyz/

**1首先搜索已经安装的docker 安装包**
yum list installed | grep docker 或是 rpm -qa | grep docker
2. 移除包
yum –y remove docker.x86_64
3. 删除对应的目录
rm -rf /var/lib/docker
