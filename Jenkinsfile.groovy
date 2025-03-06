// https://code-maven.com/jenkins-pipeline-running-external-programs

pipeline {
    agent any
    stages {
        stage('Start VM') {
            steps {
                sh 'echo start vm'
                sh "hostname"
                sh "uptime"
            }
        }

        stage('Start Wawi') {
            steps {
                sh 'echo start wawi'
            }
        }

        stage('Do other steps') {
            steps {
                sh 'echo do other steps'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'echo run tests'
            }
        }
    }
}