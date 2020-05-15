package com.noorkhan.groovydemo

def call(Map params) {
	checkout([
		$class: 'GitSCM',
		branches: [[name: params.branch]],
		userRemoteConfigs: [[url: params.url]]
		])
}