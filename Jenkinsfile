pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'gradlew clean build'                
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
            archive "target/**/*"
            junit 'build/test-results/test/*.xml'
            
            jacoco buildOverBuild: true
        }
    }
}