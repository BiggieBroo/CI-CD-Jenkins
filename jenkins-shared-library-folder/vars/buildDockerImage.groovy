#!/usr/bin/env groovy
import com.first.Docker

def call(String imageName) {
	return new Java(this).buildDockerImage(imageName)
}