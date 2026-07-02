def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
    withEnv(["PROJECT=${Project}", "IMAGETAG=${ImageTag}"]) {
      sh '''
        echo "$dockerHubPass" | docker login -u "$dockerHubUser" --password-stdin
        docker push $dockerHubUser/$PROJECT:$IMAGETAG
      '''
    }
  }
}
