Java Prototyping
================

Testing abilities of Java languages. The purpose of project is just my study, testing and fun. Project contains two
modules. One for a unit testing and second one for a micro benchmark testing.

Installation
============

Software requirements
-----

* Java 1.8 and above
* Maven 3 and above
* Maven repository with demanded dependencies

Steps
-----
TODO

Usage
=====

Benchmark
---------

```
cd benchmark
mvn clean install
java -jar target/benchmark-1.0.jar
```
Wait and see statistics

Unit testing
------------

To run tests use your IDE or through Maven use command:
```
mvn test
```

Technologies
------------

* Java Micro Harness
http://openjdk.java.net/projects/code-tools/jmh/
http://hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/

* jUnit
http://junit.org/

* Maven
https://maven.apache.org/