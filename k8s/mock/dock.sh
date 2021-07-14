docker build -t node-server .
docker tag node-server shubham0902/shubham-docker:node-server
docker push shubham0902/shubham-docker:node-server


kubectl -n attr-server get deployment nodejs-deployment  -o yaml | \
  sed 's/allowPrivilegeEscalation: false/allowPrivilegeEscalation: true/g' | \
  kubectl apply -f -


  helm upgrade demoserver mychart                

  helm install demoserver mychart  --namespace attr-server                