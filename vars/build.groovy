def call(ecr_repo, version){
  sh "docker build . -t ${ecr_repo}:${version} -f Dockerfile
}
