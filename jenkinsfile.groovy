node {
  stage('Checkout SCM') {
    if (env.CHANGE_TARGET == "master") {
      checkout scm
    }
  }
}
