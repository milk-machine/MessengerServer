cf login -a https://api.run.pivotal.io
cf push spring-boot-messenger -p build/libs/messenger-0.0.1-SNAPSHOT.jar -b https://github.com/cloudfoundry/java-buildpack.git