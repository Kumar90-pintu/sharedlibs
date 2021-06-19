def call(version){
  sh 'git clone https://github.com/Kumar90-pintu/Simpletest.git'
  sh "docker build . -t test:${version} -f Dockerfile"
}
