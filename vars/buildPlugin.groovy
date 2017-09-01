#!/usr/bin/env groovy

/**
 * Simple wrapper step for building a plugin
 */
def call(Map params = [:]) {
  Map tasks = [failFast: true];
  tasks['fake'] = {
    node {
      stage("Checkout") {
        checkout scm;
      }
      stage("Build") {
        echo "build is a no-op"
      }
    }
  }
  return parallel(tasks)
}
