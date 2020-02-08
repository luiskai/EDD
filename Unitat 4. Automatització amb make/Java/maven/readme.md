Lo primero que he hecho ha sido instalar Maven con el siguiente comando:  
sudo apt install maven

Con el siguiente comando crearemos un Hola Mundo  
mvn archetype:generate -DgroupId=com.ieseljust.edd -DartifactId=myHelloMVN -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=**false**

Después he modificado el pom.xml para que pudiera compilar con las ultimas versiones de java.

mvn compile para compilar con maven

java -cp target/classes com.ieseljust.edd.App para lanzar la aplicacion, meustra lo siguiente:  
Hello World!  
mvn clean para limpiar el proyecto.  

El modo interactivo de Maven se utiliza con la siguiente orden:  
mvn archetype:generate  
Esto me daba error al finalizar.