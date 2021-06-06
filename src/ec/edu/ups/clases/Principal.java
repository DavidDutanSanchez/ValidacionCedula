/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class Principal {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese el numero de Cedula");
        String cedula=sc.next();
        int c;
        int suma=0;
        int resta=0;
        int acumulado;
        
        for(int i=0; i<cedula.length()-1;i++){
            c=Integer.parseInt(cedula.charAt(i)+"" );
           if(i%2==0) {
               c=c*2;
               if(c>9){
                   c=c-9;
               }
           }
           suma=suma+c;
        }
        if(suma%10 !=0){
            acumulado=((suma/10)+1)*10;
            resta=acumulado-suma;
        }
        int ultimo=Integer.parseInt(cedula.charAt(9)+"");
        if(ultimo==resta){
            System.out.println("la cedula ingresada es correcta");
        }
    }
}
