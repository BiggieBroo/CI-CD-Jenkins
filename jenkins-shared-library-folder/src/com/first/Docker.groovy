#!/usr/bin/env groovy
package com.first

class Docker implements Serializable {
	def script
	Docker(script) {
		this.script = script
	}
	def dockerLogin() {
		script.withCredentials([script.usernamePassword(credentialsId: '<ID_OF_CREDENTIALS_FROM_JENKINS>', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
			script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin"
		}
	}
	def buildDockerImage(String imageName) {
		script.sh "docker build -t $imageName ."
	}
	def dockerPush(String imageName) {
		script.sh "docker push $imageName"
	}
}