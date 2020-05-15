
package com.noorkhan.groovydemo

 class sample {
	
	void test() {
		pipeline {
			agent any
				stages {
					stage('Git Checkout') {
						steps {
							gitCheckout(
								branches: "master", 
								userRemoteConfigs: "https://github.com/spring-projects/spring-petclinic.git"
							)
						}
					}
				}
			}
	}
}