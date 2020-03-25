#Procedimento para rodar o backend 
#mkdir dockerbem
#cd dockerbem
#git clone https://github.com/darlynvailatti/bempromotorabackend

Criar o arquivo docker-compose.yml com

version: '3.1'
services:
  java-backend:
    image: maven
    volumes:
      - "./bempromotorabackend:/deploy"
    working_dir: "/deploy"
    ports:
      - "8080:8080"
    command: bash -c "mvn clean && mvn install -DskipTests && java -jar target/br.com.bempromotora.backend-1.0-SNAPSHOT.jar"
    container_name: BackEndBemPromotora


#docker-compose up java-backend    ou  docker-compose up -d java-backend
