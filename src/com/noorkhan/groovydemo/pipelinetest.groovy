package com.noorkhan.groovydemo
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
				}
			}
	
}