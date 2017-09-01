#!/usr/bin/env groovy

/**
 * Simple wrapper step for building a plugin
 */
def call(Map params = [:]) {
  return {
    node {
      stage("Checkout") {
        checkout scm;
      }
      stage("Build") {
        echo "build is a no-op"
      }
    }
  }
}
