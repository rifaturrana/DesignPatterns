# DesignPattern Project

This project contains examples of various design patterns in Java.

## Instructions

### Prerequisites
Make sure you have Docker installed on your machine.

### Build Docker Image
Run the following command to build the Docker image:
```bash
docker build -t design-pattern-image .
```
### Run the following command
```bash
docker run -it --rm -v "$(pwd)":/app design-pattern-image
```
### Compile and Run Java Files
```bash
cd FactoryPattern
javac Main.java
java Main
```