def call(String url, String branch){
  echo "This is cloning the code"
  git url: "${url}" , "${branch}"
  echo  "code clone successfully."
}
