pipeline {

    agent any

    triggers {
        cron('H */8 * * *') //regular builds
        pollSCM('* * * * *') //polling for changes, here once a minute
    }

    stages {
		dir("./validator-project") {
			sh "pwd"
		}
        stage('Unit & Integration Tests') {
            steps {
                script {
					sh "pwd"
                    try {
                        sh './gradlew clean test --no-daemon' //run a gradle task
                    } finally {
                        junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
                    }
                }
            }
        }
    }

    post {
        always {
        	archiveArtifacts artifacts: '**/build/reports/**', fingerprint: true
        }
    }
}

