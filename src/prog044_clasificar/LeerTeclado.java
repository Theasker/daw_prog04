package prog044_clasificar;

import java.util.Scanner;

public class LeerTeclado {
  Scanner leer = new Scanner(System.in);
  public int LeerEdad(){
    int num;
    do{
      System.out.println("¿Qué edad tienes?");
      num = leer.nextInt();
    }while (num < 0);
    return num;
  }
  public String LeerNombre(){
    System.out.println("¿Cómo te llamas?");
    String nom = leer.next();
    return nom;
  }
}
