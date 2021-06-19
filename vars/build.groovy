def call(ecr_repo, version){
  sh "docker build . -t test:${version} -f ${ecr_repo}/Dockerfile"
}
