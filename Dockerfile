FROM java:8
MAINTAINER hubert.matthews@transformuk.com
COPY demo.jar demo.jar
CMD ["java", "-jar", "demo.jar"]
