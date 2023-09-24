package mayornumero_0;

import java.util.Scanner;



public class MayorNumero {
    Scanner entrada = new Scanner(System.in);
    int n1, n2;
    public void ent()
    {
        System.out.print("Introduzca primer entero: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca segundo entero: ");
        n2 = entrada.nextInt();
    }
    
    public void evalSal()
    {
        if (n1 > n2) {
            System.out.println(" El mayor es " + n1);
        } else {
            System.out.println(" El mayor es " + n2);
        }
    }
    public static void main(String[] args) {
        MayorNumero may;
        may = new MayorNumero();
        may.ent();
        may.evalSal();
    }

}
