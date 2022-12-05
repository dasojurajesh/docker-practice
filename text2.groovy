pipeline {
    agent any
    stages {
      stage('printing working directory'){
        steps{
             sh 'pwd'
        }
      }
      stage('clone repo'){
        steps{
            https://github.com/dasojurajesh/docker-practice.git
            
        }
        stage('build dockerfile'){
            steps {
             sh "docker build -t image14 ."   
            }
            } 
        stage ('docker images'){
            steps {
             sh "docker images"
            }
        }
        stage ('docker run the image'){
            steps {
                sh "docker run -d -p 8080:8086 image14 "
            }
        }
    }
}
    



