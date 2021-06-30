def call(value) {
        try {
            stage("Clonning codebase in workspace") {
                //checkout scm
                echo "cleaning old clone"
                sh " rm -rf $value "
                echo 'pulling'
               def url = "https://github.com/Kumar90-pintu"
               sh " git clone $url/$value "
               sh " mv /var/lib/jenkins/workspace/project-Testing/$value /var/lib/jenkins/ "
               sh "pwd"
               sh " ls -l "
        } 
       }
       catch (Exception e) {
             echo "release version is not same as pom version or package.json"
             throw e
        
        }
    }



