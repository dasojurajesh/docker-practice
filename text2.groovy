pipeline {
    agent any
    stages {
        stage('printing working directory') {
            steps {
                sh 'pwd'
            }
        }
        stage('clone repo') {
            steps {
                withCredentials([gitUsernamePassword(credentialsId: '509eda60-1194-4ccf-b8e7-2e5fb10e8a56', ), usernamePassword(credentialsId: '509eda60-1194-4ccf-b8e7-2e5fb10e8a56', passwordVariable: 'password', usernameVariable: 'username')]) {
                    echo "repo cloned"
                    sh 'ls -ltrh'
                }
            }
             
        } 
        stage('build dockerfile') {
            steps {
                sh "docker build -t image2 https://github.com/dasojurajesh/docker-practice.git"
                }

            }

        }
        
    
    }
    

    

    



