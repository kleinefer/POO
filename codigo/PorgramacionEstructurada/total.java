import java.util.Scanner;
public class tienda
{
  public static void main(String[] args ){
      Scanner sc = new Scanner (System.in);
      String [] nombres = new String [50];
      
      double [] pinturauno = new double [50];
      double [] pinturados = new double [50];
      
      int cliente, identificacion;
       
      String nombre;
      double pintura1, pintura2;
      double total = 0;
      double iva = 3.4;
      
      System.out.println("ingrese cuantos compradores son: ");
      cliente = sc.nextInt();
      for(int i = 0 ; i < cliente; i++){
        System.out.println("Digite el nombre: ");
        nombre = sc.next();
        System.out.println("Digite identificacion: ");
        identificacion = sc.nextInt();
        System.out.println("Digite el valor de la primera pintura: ");
        pintura1 = sc.nextDouble();
        System.out.println("Digite el valor de la segunda pintura: ");
        pintura2 = sc.nextDouble();
        
        nombres [i] = nombre;
        pinturauno [i] = pintura1;
        pinturados [i] = pintura2;
            
        }
        for (int i = 0; i < cliente;i++){
            total = total + pinturauno[i] + pinturados [i] ;
        }
        System.out.println("total: " + total);
  }
}