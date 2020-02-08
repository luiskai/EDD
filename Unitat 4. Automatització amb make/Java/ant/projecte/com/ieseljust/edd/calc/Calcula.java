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

        System.out.println("La suma entre "+operand1+" i "+operand2+" es "+myCalc.suma(operand1, operand2));
        System.out.println("La resta entre "+operand1+" i "+operand2+" es "+myCalc.resta(operand1, operand2));
        System.out.println("La multiplicacio entre "+operand1+" i "+operand2+" es "+myCalc.multiplica(operand1, operand2));
        System.out.println("La divisio entre "+operand1+" i "+operand2+" es "+myCalc.divideix(operand1, operand2));
        System.out.println("Ultima operacio realitzada: "+myCalc.getLastOp()+"; Ultim resultat: "+myCalc.getLastResult());
        
        System.out.println("La mitjana de "+operand1+" i "+operand2+" es "+myCalc.Mitjana(operand1, operand2));
    }
}