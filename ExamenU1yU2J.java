/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1yu2;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class ExamenU1yU2J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del primer producto");
        String nom1 = scanner.nextLine();
        System.out.println("Ingrese el precio del producto uno");
        double pre1 = scanner.nextDouble();
        
        
        System.out.println("Ingrese el precio del segundo producto");
        double pre2 = scanner.nextDouble();
        
        
        System.out.println("Ingrese el precio del tercer producto");
        double pre3 = scanner.nextDouble();
        
        scanner.close();
        
        double tot1 = pre1*30/100;
        double tot2 = pre2*65/100;
        double tot3 = pre3*15/100;
        
        System.out.println("El primer producto es: " + nom1 + " y su precio final del videojuego 1 es de " + tot1);
        System.out.println("El segundo producto es Mario y su precio final del videojuego 2 es de " + tot2);
        System.out.println("El tercer producto es Huhu y su precio final del videojuego 3 es de " + tot3);
        
        
    }
    
}
