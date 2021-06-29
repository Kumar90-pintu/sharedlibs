def call(value) {
        try {
            stage("Clonning codebase in workspace") {
                //checkout scm
                echo "cleaning old clone"
                sh " rm -rf $value "
                echo 'pulling'
               def url = "https://github.com/Kumar90-pintu"
               sh " git clone $url/$value "
        } 
       }
       catch (Exception e) {
             echo "release version is not same as pom version or package.json"
             throw e
        
        }
    }



