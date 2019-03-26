node {
  stage('Checkout SCM in PUll Req') {
    if (env.CHANGE_TARGET == "develop") {
      checkout scm
    }
  }
  
  stage('Checkout SCM in code merge') {
    if (env.BRANCH_NAME == "master") {
      checkout scm
    }
  }
}
