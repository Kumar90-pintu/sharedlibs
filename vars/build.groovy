def call(proj) {
        try {
            stage("buildImage") {
                //checkout scm
               echo " you are in build section"
               echo 'building image'
               sh "pwd"
               sh "ls -l"
               sh " cd $proj"
               sh " ls -l"
               //def url = "https://github.com/Kumar90-pintu"
               sh " sudo docker build -t test /var/lib/jenkins/workspace/project-Testing/$proj/."

        }
       }
        catch (Exception e) {
               echo "build is fail"
               throw e

        }
    }

