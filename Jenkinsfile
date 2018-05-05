pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'gradlew clean build'
                
                openTasks canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', high: 'FIXME', low: '', normal: 'TODO', pattern: '**/*java', unHealthy: ''                
            }
        }
        stage('Test') {
            steps {
            	build job : 'FunctionalTest'
                echo 'Testing..'   
                bat 'java -jar D:\\JenkinsWorkspace\\workspace\\FunctionalTest\\build\\libs\\FunctionJar.jar "D:\\JenkinsWorkspace\\workspace\\ReggiePip"'             
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
        
    }
    post {
        always {
            archive "build/test-results/test/**/*"
            junit 'build/test-results/test/*.xml'            
            
            perfpublisher healthy: '', metrics: '', name: '**/*functional_test.xml', threshold: '', unhealthy: ''
            
            jacoco buildOverBuild: true
        }
    }
}