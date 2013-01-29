package prog043_factoresprimos;

import java.util.InputMismatchException;

public class Factorizar {
  int primo = 2;
  int num;
  public Factorizar(){
    LeerTeclado lee = new LeerTeclado();
    try{
      
    
      num = lee.PedirNumero();
      if (num == 1){
        System.out.println("1 = 1");
      }else{ // Si el número introducido es mayor que 1
        System.out.print(num + " = ");
        //Seguir hasta que el número y el número primo sean iguales
        while (num != primo){ 
          if (num % primo == 0){ // Es divisible por el número primo
            System.out.print(primo + " x ");
            num = num / primo;
          }else{ // Si no es divisible por el número
            primo++;          
          }
        }
        // Añade el último primo porque sale del bucle while sin visualizarlo
        System.out.println(primo+" x 1");
      }
    }catch (InputMismatchException e){
      System.out.println("Eso no es un número entero: "+e.toString());
    }
  }
}
