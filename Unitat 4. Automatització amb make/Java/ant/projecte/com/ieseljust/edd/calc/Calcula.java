package com.ieseljust.edd.calc;

import com.ieseljust.edd.calc.Calculadora;

public class Calcula {
    private static float operand1;
    private static float operand2;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("\nSintaxi incorrecta. Necessite dos numeros.");
            System.exit(-1);
        }

        operand1=Float.parseFloat(args[0]);
        operand2=Float.parseFloat(args[1]);

        Calculadora myCalc=new Calculadora();

        System.out.println("La suma entre "+operand1+" i "+operand2+" �s "+myCalc.suma(operand1, operand2));
        System.out.println("La resta entre "+operand1+" i "+operand2+" �s "+myCalc.resta(operand1, operand2));
        System.out.println("La multiplicaci� entre "+operand1+" i "+operand2+" �s "+myCalc.multiplica(operand1, operand2));
        System.out.println("La divisi� entre "+operand1+" i "+operand2+" �s "+myCalc.divideix(operand1, operand2));
        System.out.println("�ltima operaci� realitzada: "+myCalc.getLastOp()+"; �ltim resultat: "+myCalc.getLastResult());
    }
}