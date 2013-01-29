package prog043_factoresprimos;

import java.util.Scanner;

public class LeerTeclado {
  public int PedirNumero(){
    int num;
    Scanner lee = new Scanner(System.in);
    do{
      System.out.print("Introduce un número entero mayor que 0: ");
      num = lee.nextInt();
    }while (num < 1);
    return num;
  }
}
