package prog044_clasificar;

import java.util.InputMismatchException;

public class Clasificar {
  int edad;
  String nom;
  LeerTeclado leer = new LeerTeclado();
  
  public Clasificar(){
    edad = leer.LeerEdad();
    nom = leer.LeerNombre();
    try{
      edad = edad + 10;
      System.out.println("Dentro de 10 años tendrá "+edad);
      if ((edad >= 0) & (edad <= 25)){
        System.out.println(nom + " pertenece al grupo A");
      }else if ((edad >= 26) & (edad <= 50)){
        System.out.println(nom + " pertenece al grupo B");
      }else if (edad >= 51){
        System.out.println(nom + " pertenece al grupo C");
      }
    }catch(InputMismatchException e){
      System.out.println("Eso no es un número entero: "+e.toString());
    }
  }
}
