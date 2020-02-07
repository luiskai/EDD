Lo primero que he hecho ha sido crear la estructura para la aplicación Java. Despues he creado los dos archivos de Java, Calcula.java y Calculadora.java y he metido todo el codigo dentro de cada uno  

Para compilar los programas (estando en el mismo direcotrio) ejecutaremos lo siguiente:  
javac ./*.java  
Para ejecutar la calculadora:  
java com.ieseljust.edd.calc.Calcula num1 num2  
Esto me ha dado error y no he podido continuar.  

He hecho el build.xml.  
He instalado el ant y he compilado con el siguiente comando:  
ant compile  
Para la exclusión he hecho lo siguiente:  
ant run -Darg0=3 -Darg1=4