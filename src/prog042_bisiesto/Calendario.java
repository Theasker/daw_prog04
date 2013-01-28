package prog042_bisiesto;

import java.util.InputMismatchException;

public class Calendario {
  int anio, mes;
  int[] diasmes = {0,31,28,31,30,31,30,31,31,30,31,30,31};
  String[] meses = {"","Enero", "Febrero", "Marzo", "Abril", "Mayo", 
    "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
  LeerTeclado datos = new LeerTeclado();
  Bisiesto bis = new Bisiesto();
  
  public Calendario(){
    try{
      anio = datos.PedirAnio();
      mes = datos.PedirMes();
      if (mes == 2){
      if (bis.CalcularBisiesto(anio)){ // Si el año es bisiesto
        diasmes[2] = 29;
      }
    }
    System.out.println("Los días del mes de " + meses[mes] + " de " + anio + " son " + diasmes[mes]);
    }catch(InputMismatchException e){
      System.out.println("Eso no es un número entero: "+e.toString());
    }  
  }
}
