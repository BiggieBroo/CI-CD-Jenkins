#!/usr/bin/env groovy
package com.first

class Java implements Serializable {
	def script
	Java(script) {
		this.script = script
	}
	def buildJar() {
		script.sh "mvn package"
	}
}