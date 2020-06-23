# demo_docker_springboot

## Demo

Here we have a simple SpringBoot-Application combined with the simplest docker-integration.

Installation:
* Download Docker
* SpringBoot should be fetched from Maven when building
* launch without Docker to test!
* check localhost:8086/convertion (needed GET parameters fromCurrency=Yen/Dollar/Euro, toCurrency=Yen/Dollar/Euro, value=Double)
* it should output a simple convertion
* if it works, run the following docker commands in Terminal:
* docker build -f Dockerfile -t docker-example-kotlin-java2 .
* docker run --name SERVICE_NAME -p 8086:8086 -d docker-example-kotlin-java2
(RUNNING IN CONTAINER SERVICE_NAME on port 8086)
