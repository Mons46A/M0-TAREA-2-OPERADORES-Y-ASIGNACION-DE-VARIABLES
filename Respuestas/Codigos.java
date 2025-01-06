/// Ejercicio 1:

public class ConvertidorHoras {
public static void main(String[] args){
int horas = 1500;
System.out.println("La cantidad de horas son: "+horas);
int semanas = horas/24/7;
System.out.println("Semanas: "+semanas);
horas -= semanas*7*24;
int dias = horas/24;
System.out.println("Dias: "+dias);
horas -= dias*24;
System.out.println("Horas: "+horas);
}
}

/// Ejercicio 6:
public class prueba {
public static void main(String[] args) {
int n1 = 5 , n2 = 10, n3 = 20;
System.out.println("n1 + n2 = "+ (n1+n2));
System.out.println("n3 - n1 = "+ (n3-n1));
System.out.println("n1 * n3 = "+ (n1*n3));
System.out.println("n3 / n2 = "+ (n3/n2));
}
}

/// Ejercicio 7 :
public class prueba {
public static void main(String[] args) {
int n1 = 10 , n2 = 20, n3 = 30;
int suma = n1+n2+n3;
System.out.println("El total: "+ (suma));
System.out.println("El promedio: "+ (suma/3));
System.out.println("El resto entre n2 y n1: "+ (n1%n2));
}
}
