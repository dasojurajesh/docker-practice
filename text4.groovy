pipeline  {
    agent any
    stages {
        stage('printing working directory') {
            steps {
                sh 'pwd'
            }
        }

    }
}
