/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class CuentaAhorros extends Calculadora {

    public CuentaAhorros(String nombre, int codigo, int dia, String mes, int año, int saldo) {
        super(nombre, codigo, dia, mes, año, saldo);
    }
    
    
    @Override
    public String getTipoCuenta() {
        return "Cuenta de Ahorro Empresarial";
    }
 
}
