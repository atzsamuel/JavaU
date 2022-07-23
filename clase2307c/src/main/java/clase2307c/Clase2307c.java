/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2307c;

/**
 *
 * @author alumno
 */
public class Clase2307c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----Clase Empleado");
        Empleado emplea = new Empleado("Samuel Atz", 0, "22/08/1999", 0, "Gautemala, chimaltenango");
        System.out.println("El nombre enviado es: " + emplea.getNombre());
        emplea.setNombre("Marcos Atz");
        System.out.println("El nuevo nombre es:" + emplea.getNombre());
        System.out.println("---Clase Proveedor");
        Proveedor provee = new Proveedor();
        provee.nombre = "Paiz";
        System.out.println("El nombre del proveedor es : " + provee.nombre);
        provee.setNombre("Walmart");
        System.out.println("El nuevo nombre del proveedor es: " + provee.getNombre());
        System.out.println("---Clase Producto");
        Producto producto = new Producto();
        producto.setNombre("Manzana");
        System.out.println("Mi producto es: " + producto.getNombre());
    }

}
