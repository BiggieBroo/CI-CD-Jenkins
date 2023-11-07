#!/usr/bin/env groovy
import com.first.Java

def call() {
	return new Java(this).buildJar()
}