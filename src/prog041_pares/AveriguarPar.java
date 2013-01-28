package prog041_pares;

import java.util.InputMismatchException;

public class AveriguarPar {
  // Instancio la clase LeerTeclado
  LeerTeclado leer;
  int num;
  public AveriguarPar(){
    leer = new LeerTeclado();
    try{
      num = leer.pedirNumero();
    }catch(InputMismatchException e){
      System.out.println("Eso no es un número entero: "+e.toString());
    }catch(Exception e){
      System.out.println("Error: "+e.toString());
    }
    if (esPar(num)){
      System.out.println("El número "+ num + " es par.");
    }else{
      System.out.println("El número "+ num + " no es par.");
    }
  }
  private boolean esPar(int a){
    if ((a % 2)==0) {
      return true;
    }else{
      return false;
    }
  }
}
