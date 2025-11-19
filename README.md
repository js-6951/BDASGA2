# SGA2 BDA coursework

### Dependencies

```
# install OpenJDK 17 (required by the project)
sudo apt install -y openjdk-17-jdk

# verify java
java -version

# install Maven
sudo apt install -y maven

# verify mvn
mvn -v

# install Git
sudo apt install -y git

# install MySQL
sudo apt install -y mysql-server
```

- Java JDK 17
- Maven
- Git 
- mysql

----
### mysql setup:

setup the user:
For the sake of the example, we are using the following user and password details.

```
# enter mysql shell as root
sudo mysql

# inside mysql shell, run:
CREATE DATABASE schooldb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'Password123';
GRANT ALL PRIVILEGES ON schooldb.* TO 'springuser'@'localhost';
FLUSH PRIVILEGES;
EXIT;
```

We can now check the connection:
```
mysql -u springuser -p -D schooldb

SHOW TABLES;
EXIT;
```

### Running the springboot app:

```
mvn clean package

mvn spring-boot:run
```

### Running tests:
```
mvn test
```
