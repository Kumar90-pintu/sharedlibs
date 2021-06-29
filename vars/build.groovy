def call(proj) {
        try {
            stage("buildImage") {
                //checkout scm
               echo " you are in build section"
               echo "pwd/$proj"
               sh " cd pwd/$proj "
                echo 'building image'
               //def url = "https://github.com/Kumar90-pintu"
               sh " docker build -t test Dockerfile "
        }
       }
        catch (Exception e) {
               echo "build is fail"
               throw e

        }
    }

