mvn clean install
docker build -t geekhitesh/users-details .
docker push geekhitesh/users-details
kubectl apply -f .
#kubectl expose deployment users-details --name=users-details --dry-run -o yaml > service.yaml