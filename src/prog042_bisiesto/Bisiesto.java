package prog042_bisiesto;

public class Bisiesto {
  public boolean CalcularBisiesto(int anio){
    // divisible por 4, que no sea de 100 pero si de 400
    if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0) ) { 
      return true;
    }else{
      return false;
    }
  }
}
