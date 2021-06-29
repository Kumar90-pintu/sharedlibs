def call() {
        try {
            stage("Clonning codebase in workspace") {
                checkout scm
                echo 'Pulling...' + env.BRANCH_NAME
        } 
       }
       catch (Exception e) {
             echo "release version is not same as pom version or package.json"
             throw e
        
        }
    }



