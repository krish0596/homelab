this is kubernetes homelab to test the
deplyment of a simple java application with k8, ingress, services, helm and later flux and kustomze


TODO:  
refine helm chart   
deploy multiple release with diff ports nad test ingress  
also check meshes  
pvcs and all  
fluc cd bootstrap on diff branch?  
kustomize overlays  
additional k8 resources like CNI plugins and all  
multi stage dockerfile build possible right now it assumes we have a pre built in build//libs

this shall grow with time

maybe also include ansible playbooks for future ????


USE:
Prerequisite: minikube , kubectl
build the java application using gradlew build
build the image using docker and push it into any container registry, create its secret using  
kubcetl apply -f and install the homelab helm chart. to test the service we can exec into any of the pods  
and curl the service  
to test we need to use minikube tunnel since minikube runs inside the vm and then we can use the   
curl with resolve cmd to test. and then inspect the logs of the homlab application pod
