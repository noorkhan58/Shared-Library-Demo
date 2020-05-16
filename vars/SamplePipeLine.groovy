import com.noorkhan.groovydemo.gitCheckout

def call() {
	pipeline {
			agent any
				stages {
					stage('Git Checkout') {
						steps {
							echo 'Hello World'
							gitCheckout(
								branch: "master", 
								url: "https://github.com/spring-projects/spring-petclinic.git"
							)
						}
					}
					stage('Build') {
						steps {
							echo 'Building'
							sh 'mvn -Dmaven.test.failure.ignore=true install'
						}
					}
				}
			}
	
}