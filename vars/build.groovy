def call(version){
  sh "docker build . -t test:${version} -f Dockerfile"
}
