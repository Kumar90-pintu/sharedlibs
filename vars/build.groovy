def call(ecr_repo){
  sh "docker build . -t ${ecr_repo}:${version} -f Dockerfile
}
