def call(value) {
        try {
            stage("buildImage") {
                //checkout scm
               echo " you are in build section"
               sh " cd $value "
                echo 'building image'
               //def url = "https://github.com/Kumar90-pintu"
               sh " docker build -t $value Dockerfile "
        }
       }
        catch (Exception e) {
               echo "build is fail"
               throw e

        }
    }

