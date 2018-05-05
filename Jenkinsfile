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
                echo 'Testing..'                
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
            
            jacoco buildOverBuild: true
        }
    }
}