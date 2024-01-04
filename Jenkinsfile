node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    sh "export JAVA_HOME='/usr/libexec/java_home -v 11.0'"
    def mvn = tool 'Default Maven';
    def scannerHome = tool 'SonarScanner';
    withSonarQubeEnv('SonarQube-9.9') {
//      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=maven-basic"
      sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=maven-basic"
    }
    echo "analysis finished."
  }
}
echo "calculating QG ..."
// No need to occupy a node
stage("Quality Gate"){
  timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
    def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
    if (qg.status != 'OK') {
      error "Pipeline aborted due to quality gate failure: ${qg.status}"
    }
  }
}
