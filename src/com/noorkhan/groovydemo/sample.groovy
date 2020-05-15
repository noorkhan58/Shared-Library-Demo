
package com.noorkhan.groovydemo
import com.noorkhan.groovydemo.gitCheckout
 class sample {
	
	void test() {
		pipeline {
			agent any
				stages {
					stage('Git Checkout') {
						steps {
							gitCheckout(
								branch: "master", 
								url: "https://github.com/spring-projects/spring-petclinic.git"
							)
						}
					}
				}
			}
	}
}