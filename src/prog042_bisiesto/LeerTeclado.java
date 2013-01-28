package prog042_bisiesto;

import java.util.Scanner;

public class LeerTeclado {
  Scanner leer = new Scanner(System.in);
  public int PedirMes(){
    int num;
    do{
      System.out.print("Introduce un número de mes: ");
      num = this.leer.nextInt();
    }while((num < 1) || (num > 12));
    return num;
  }
  public int PedirAnio(){
    int num;
    System.out.print("Introduce un año: ");
    num = this.leer.nextInt();
    return num;
  }
}
