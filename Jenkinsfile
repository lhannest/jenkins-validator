pipeline {

    agent any

    triggers {
        cron('H */8 * * *') //regular builds
        pollSCM('* * * * *') //polling for changes, here once a minute
    }

    stages {
        stage('Testing') {
            steps {
				dir("./validator-project") {
					script {
                	    try {
                	        sh './gradlew clean test --no-daemon' //run a gradle task
                	    } finally {
                	        junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
                	    }
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

