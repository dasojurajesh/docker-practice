pipeline {
    agent any
    stages{
        stage('printing working directory'){
            steps{
                sh 'pwd'
            }
        }
    stage ('clone repo'){
        steps {
       withCredentials([usernamePassword(credentialsId: '509eda60-1194-4ccf-b8e7-2e5fb10e8a56', passwordVariable: 'shivani@1234', usernameVariable: 'shivani')]) {

}



}
            echo "repo cloned"
            sh 'ls -ltrh'
    }
    }
    }
    stage ('build dockerfile'){
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
    



