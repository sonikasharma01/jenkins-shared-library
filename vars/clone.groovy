def call(string url, string branch){
  echo "This is cloning the code"
  git url: "${url}" , "${branch}"
  echo  "code clone successfully."
}
