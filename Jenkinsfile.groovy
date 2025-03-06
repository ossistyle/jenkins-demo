pipeline {
    agent any
    stages {
        stage('Start VM') {
            steps {
                sh 'echo start vm'
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