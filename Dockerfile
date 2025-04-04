FROM openjdk:17-jdk

# Copia o JAR gerado para o diretório correto do Tomcat
COPY target/springboot-0.0.1.jar /app/app.jar

# Inicia o Tomcat
CMD ["java", "-jar", "/app/app.jar"]

# Define o diretório de trabalho dentro do container
#WORKDIR /usr/local/tomcat

# Remove aplicações padrão do Tomcat para evitar conflitos
#RUN rm -rf webapps/*

# Copia o WAR gerado para o diretório correto do Tomcat
#COPY target/springboot-0.0.1.war /app/app.jar

# Expõe a porta 8080
#EXPOSE 8080

# Inicia o Tomcat
#CMD ["catalina.sh", "run"]