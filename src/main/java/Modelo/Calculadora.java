/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Calculadora extends Cuentas {

    public Calculadora(String nombre, int codigo, int dia, String mes, int año, int saldo) {
        super(nombre, codigo, dia, mes, año, saldo);
    }
    
   
    
    
    public String consignacion (int monto) {
        if (monto<=0) {
            return "ERROR: Ingrese un monto mayor a cero.";
        }
        saldo += monto ;
        return "La consignación se ha hecho con exito."
                + "Monto consignado: " + monto + "\n"
                + "Nuevo saldo: " + saldo;
    }
    
    
    public String retiro (int monto) {
        if (monto<=0 ) {
            return "ERROR: Ingrese un monto mayor a cero.";
        }
        if (monto > saldo){
            return "ERROR: Fondos insuficientes, por favor, elija otro monto de dinero.";
        }
        saldo -= monto ;
        return "El retiro se ha hecho con exito."
                + "Monto retirado: " + monto + "\n"
                + "Nuevo saldo: " + saldo; 
    }
      
    
}
