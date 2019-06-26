package javaapplication27;

import java.util.*;
public class JavaApplication27 {
    
    public static void main(String[] args) {       
        Scanner leer = new Scanner(System.in);
        
        ArrayList <String> nombreProducto= new ArrayList();
        ArrayList <Double> valorProducto=new ArrayList();
        
        boolean continuar=true;
        int decision=1, total=0;
        double  control=0;
        String productoMasalto="";
        while(continuar){
            System.out.println("Ingrese el nombre del producto: ");
            nombreProducto.add(leer.next());
            System.out.println("");
            System.out.println("Ingrese el valor del producto: ");
            valorProducto.add(leer.nextDouble());
            System.out.println("Desea ingresar mas producto? (0 para salir)");
            decision=leer.nextInt();
            if(decision ==0){
                continuar=false;
            }
           
                   
        }
        for(int i=0; i<valorProducto.size();i++){
            System.out.println(nombreProducto.get(i)+ "\t" + valorProducto.get(i));
            total+=valorProducto.get(i);
            if(valorProducto.get(i)>control){
                productoMasalto=nombreProducto.get(i);
                control = valorProducto.get(i);
                
                
            }
            
            
        }
        System.out.println("Total: "+total);
        System.out.println("Producto mas alto: " + productoMasalto+" con "+ control);
        
        
      
       
        
    }
    
}
