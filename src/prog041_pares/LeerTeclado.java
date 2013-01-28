package prog041_pares;

import java.util.Scanner;

public class LeerTeclado {
  public int pedirNumero(){
    int num;
    System.out.println("Introduce un número entero: ");
    Scanner leer = new Scanner(System.in);
    num = leer.nextInt();
    return num;
  }        
}
