This is a POC for gradle, springboot, rest assured, docker, mysql and hibernate.

**Requirements:**

docker
java8

`docker run -p 3306:3306 --name=trumpit-mysql -e MYSQL_ROOT_PASSWORD=root  -e MYSQL_DATABASE=trumpit mysql:latest`

`./gradlew build`

`./gradlew bootRun`
