import java.util.*;


class DevuelveCambio{
  public static void main(String arg[]){            
	 
  Scanner sc = new Scanner(System.in);
  System.out.println("Introduzca Cantidad");

      int dinero=sc.nextInt();
    
      int billete500=dinero/500;
      dinero = dinero%500;
    
      int billete200=dinero/200;
      dinero = dinero%200;
    
      int billete100=dinero/100;
      dinero = dinero%100;
    
        int billete50=dinero/50;
        dinero= dinero%50;
    
        int billete20=dinero/20;
        dinero= dinero%20;
    
        int billete10=dinero/10;
        dinero= dinero%10;
    
        int billete5=dinero/5;
        dinero= dinero%5;
    
        int moneda2=dinero/2;
        dinero= dinero%2;
    
        int moneda1=dinero/1;
        dinero= dinero%1;

         if(billete500>0){
             System.out.println("Le devolvemos de vuelta = " + billete500 + " billetes de 500€");
         }

         if(billete200>0){
             System.out.println("Le devolvemos de vuelta = " + billete200 + " billetes de 200€");
         }

         if(billete100>0){
             System.out.println("Le devolvemos de vuelta = " + billete100 + " billetes de 100€");
         }

         if(billete50>0){
             System.out.println("Le devolvemos de vuelta = " + billete50 + " billetes de 50€");
         }

         if(billete20>0){
             System.out.println("Le devolvemos de vuelta = " + billete20 + " billetes de 20€");
         }

         if(billete10>0){
             System.out.println("Le devolvemos de vuelta = " + billete10 + " billetes de 10€");
         }

         if(billete5>0){
             System.out.println("Le devolvemos de vuelta = " + billete5 + " billetes de 5€");
         }

         if(moneda2>0){
             System.out.println("Le devolvemos de vuelta = " + moneda2 + " monedas de 2€");
         }

         if(moneda1>0){
             System.out.println("Le devolvemos de vuelta = " + moneda1 + " monedas de 1€");
         }
   
    }
}