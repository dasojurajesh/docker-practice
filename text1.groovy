pipeline {
    agent any

     stages {
         stage('Add Folder')  {
            steps {
            sh 'mkdir  shivani-folder'
            sh 'ls -ltrh'
            sh ' echo "I am working"'
            }
         }

     }

}


            

              
         
     


