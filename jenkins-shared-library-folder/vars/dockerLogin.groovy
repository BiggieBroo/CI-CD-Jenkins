#!/usr/bin/env groovy
import com.first.Docker

def call() {
	return new Docker(this).dockerLogin()
}