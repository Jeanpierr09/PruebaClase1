package edu.ejercicios;



import edu.ejercicios.EjerciciosEnCLase.Ejercicios;
import edu.ejercicios.ejemplos.clsEjemplo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*String varA = "";
        String varB = "";
        try{
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese A:");
            varA = lector.readLine();
            System.out.println("Ingrese B:");
            varB = lector.readLine();
            System.out.println("valor de a=" +varA + "valor de b=" +varB);


        }catch(Exception ex){
            System.out.println("Ingresó mal el dato");
        }

        clsEjemplo1 ej = new clsEjemplo1();
        int a = Integer.parseInt(varA);
        int b = Integer.parseInt(varB);

        ej.calculo(a,b);*/

        /////////////////////////////AREA DE UN CIRCULO////////////////////////////


        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        double radio = 0.00;
        try {
            System.out.println("Ingrese el radio del circulo:");
            radio = Double.parseDouble(lector.readLine());

            Ejercicios ej = new Ejercicios();
            ej.AreaCirculo(radio);

        } catch (Exception ex) {

        }
        ///////////////////////////////////////////////////////////////////////////////

        ///////////////////////////////CIRCUNFERENCIA DE UN CIRCULO////////////////////

        BufferedReader Lector = new BufferedReader(new InputStreamReader(System.in));




    }
}
