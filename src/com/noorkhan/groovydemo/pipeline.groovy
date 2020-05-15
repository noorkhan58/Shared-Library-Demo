package com.noorkhan.groovydemo

def call() {
	pipeline {
			agent any
				stages {
					stage('Git Checkout') {
						steps {
							gitCheckout(
								branche: "master", 
								url: "https://github.com/spring-projects/spring-petclinic.git"
							)
						}
					}
				}
			}
	
}