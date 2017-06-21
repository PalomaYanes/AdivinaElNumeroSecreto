/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdivinaElNumeroSecreto;

import java.util.Scanner;
import modelo.Juego;

/**
 *
 * @author palom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    Scanner entrada= new Scanner (System.in);
        int numero;
        boolean seAdivinoElNumeroSecreto=false; 
        Juego juego=new Juego (1,100,5);
        while (juego.puedeIntentarDeNuevo()==true && !seAdivinoElNumeroSecreto) 
        {
            System.out.print("Adivine el Numero Secreto: ");
            numero=entrada.nextInt();
            seAdivinoElNumeroSecreto=juego.esElNumeroSecreto(numero);
            if (seAdivinoElNumeroSecreto) 
            {
                System.out.println("FELICIDADES!!! Has adivinado el NumeroSecreto");
            }
            else
            {
                System.out.println("Fallaste :( El numero secreto es: " 
                        + juego.getTextoDeAyuda(numero) + "que el numero proporcionado"); 
                System.out.println("Intentalo de Nuevo");
            }
        System.out.println("El numero secreto es: " + juego.getNumeroSecreto());
        }
    }
    
}