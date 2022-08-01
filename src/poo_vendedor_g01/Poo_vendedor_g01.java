
package poo_vendedor_g01;

import java.util.Scanner;
public class Poo_vendedor_g01 {

    
    public static void main(String[] args) {
         Scanner consola=new Scanner(System.in);
         consola.useDelimiter("\n");
         //Definición de variables 
         int N,tipo;
         String nombre;
         long documento;
         double ventas,comision=0,total_comision=0;
         //Proceso
         System.out.println("Cantidad de vendedores: ");
         N=consola.nextInt();
         for(int i=0;i<N;i++){
             System.out.println("Documento de identidad: ");
             documento=consola.nextLong();
             System.out.println("Nombre vendedor:");
             nombre=consola.next();
             consola.nextLine();
             System.out.println("Tipo(1:Puerta a puerta,2:Telemercadeo): ");
             tipo=consola.nextInt();
             System.out.println("Ventas del mes: ");
             ventas=consola.nextDouble();
             //Utilización de la clase - Creación del objeto
             Vendedor obj_vendedor=new Vendedor(documento,nombre,tipo,ventas);
             comision=obj_vendedor.pagoComision();
             //System.out.println("Nombre vendedor: "+nombre);
             System.out.println("Nombre vendedor: "+obj_vendedor.getNombre());
             System.out.println("Comisión: "+comision);
             total_comision+=comision;
         }
         System.out.println("Total comisiones: "+total_comision);
    }
    
}
