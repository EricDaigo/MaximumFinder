//MaximumFinder

import java.util.Scanner;
  
class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Entre com 3 valores separados por espaços: ");

    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    double result = maximum(num1, num2, num3);

    System.out.println();
    System.out.println("O valor máximo é: " + result);
  }

  public static double maximum(double x, double y, double z){
    double valorMaximo = x;

    if(y > valorMaximo){
      valorMaximo = y;
    }
    
    if(z > valorMaximo){
      valorMaximo = z;      
    }

    return valorMaximo;
  }

  
}