Lo primero que he hecho ha sido crear la estructura para la aplicación Java. Despues he creado los dos archivos de Java, Calcula.java y Calculadora.java y he metido todo el codigo dentro de cada uno  

Para compilar los programas (estando en el mismo direcotrio) ejecutaremos lo siguiente:  
javac ./*.java  
Para ejecutar la calculadora:  
java com.ieseljust.edd.calc.Calcula 4 2 

Para la funcion Mitjana y MajorQue he introducido lo siguiente en Calculadora.java:  
public float MajorQue(float op1, float op2){
        if (op1>op2) {
            return op1;
        }
        else{
            return op2;
        }
    }
    
    public float Mitjana(float op1, float op2){
        // Fem els calculs
        float mediana = op1+op2;
        float result=mediana/2;

        // Actualitzem els atributs de la classe
        this.lastResult=result;
        this.lastOp="Mitjana";

        // I finalment retornem els resultats
        return result;
    }

Y lo siguiente en Calcula.java:  
```
System.out.println("El seguent numero es el mes gran: " + myCalc.MajorQue(operand1, operand2));  
System.out.println("La mitjana de "+operand1+" i "+operand2+" es "+myCalc.Mitjana(operand1, operand2));  
```
He hecho el build.xml.  
He instalado el ant y he compilado con el siguiente comando:  
ant compile  
Para la exclusión he hecho lo siguiente:  
ant run -Darg0=3 -Darg1=4