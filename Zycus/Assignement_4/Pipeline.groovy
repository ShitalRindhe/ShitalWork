pipeline {
    agent any

    stages {
        stage('mail') {
            steps {
			mail bcc: '', body: '''Hello <Release Manager Name>,

            Please provide your confirmation for today's immediate delivery. ''', cc: '', from: '<EMAIL Id>', replyTo: '', subject: 'Approval for Customer Release', to: '<Release Manager email Id>'

                echo 'Sending an email to Release Manager'
            }
        }
        stage('Trigger Job') {
            steps {
			    def job = build job: 'DEMO2'
                echo 'Triggering DEMO2 JOB'
            }
        }

        
    }
}