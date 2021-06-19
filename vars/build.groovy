def call(version){
  //sh 'git clone https://github.com/Kumar90-pintu/Simpletest.git'
  sh 'ls -l'
  sh "sudo docker build . -t test:${version} -f Simpletest/Dockerfile"
}
