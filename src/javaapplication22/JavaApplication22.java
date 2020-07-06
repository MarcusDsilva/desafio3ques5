/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Admin
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n;
      Scanner ler = new Scanner (System.in);

      System.out.println("Informe o numero");
     n = ler.nextInt();

     if (n % 2 == 0){
     System.out.println("o numero e par:");
     }else{
     System.out.println("o numero é impar");
     } 
      if (n > 0){
      System.out.println("O numero é positivo ");
      }else if (n < 0){
       System.out.println("O numero é negativo");
      }else{
        System.out.println("o numero é nulo:");
              }
    }
}