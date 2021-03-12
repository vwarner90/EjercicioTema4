/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Pepe Fernández","1023-2464-90-1232256789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println(cuenta1.getNombre_cliente());
        System.out.println("El saldo actual es: " + saldoActual );

        opera(cuenta1, 2300, 695);
 
    }

    public static void opera(CCuenta cuenta1, float cantRetirar, float cantIngresar) {
        try {
            cuenta1.retirar(cantRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
