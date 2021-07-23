**spring somethings learning**

**Kubernetes 中文指南/云原生应用架构实践手册**
https://jimmysong.io/kubernetes-handbook

**Kubernetes指南**
https://kubernetes.feisky.xyz/

**卸载Docker**
1.首先搜索已经安装的docker安装包
yum list installed | grep docker 或是 rpm -qa | grep docker
2. 移除包
yum –y remove docker.x86_64
3. 删除对应的目录
rm -rf /var/lib/docker

**卸载 kubernetes**
kubeadm reset -f
modprobe -r ipip
lsmod
rm -rf ~/.kube/
rm -rf /etc/kubernetes/
rm -rf /etc/systemd/system/kubelet.service.d
rm -rf /etc/systemd/system/kubelet.service
rm -rf /usr/bin/kube*
rm -rf /etc/cni
rm -rf /opt/cni
rm -rf /var/lib/etcd
rm -rf /var/etcd
yum clean all
yum remove kube*

博客
https://www.cnblogs.com/dukuan/
