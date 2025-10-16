/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente extends Calculadora {
    
     private int cupoSobregiro;
     
    public CuentaCorriente(String nombre, int codigo, int dia, String mes, int año, int saldo, int cupoSobregiro) {
        super(nombre, codigo, dia, mes, año, saldo);
        this.cupoSobregiro = cupoSobregiro;
    }

    public CuentaCorriente(String nombre, int codigo, int dia, String mes, int año, int saldo) {
        super(nombre, codigo, dia, mes, año, saldo);
        this.cupoSobregiro = 500000;
    }
    
    
    public int getCupoSobregiro() {
        return cupoSobregiro;
    }
    
    public void setCupoSobregiro(int cupoSobregiro) {
        this.cupoSobregiro = cupoSobregiro;
    }
    
    @Override
    public String getTipoCuenta() {
        return "Cuenta Corriente";
    }
    
    @Override
    public String retiro(int monto) {
        if (monto <= 0) {
            return "ERROR: Ingrese un monto mayor a cero.";
        }
        
        int disponibleTotal = saldo + cupoSobregiro;
        
        if (monto > disponibleTotal) {
            return "ERROR: Fondos insuficientes.\n"
                    + "Saldo actual: $" + saldo + "\n"
                    + "Cupo de sobregiro: $" + cupoSobregiro + "\n"
                    + "Total disponible: $" + disponibleTotal + "\n"
                    + "Monto solicitado: $" + monto;
        }
        
        saldo -= monto;
        
        String mensaje = "El retiro se ha hecho con éxito.\n"
                + "Monto retirado: $" + monto + "\n"
                + "Nuevo saldo: $" + saldo + "\n";
        
        
        if (saldo < 0) {
            int sobregiroUsado = Math.abs(saldo); 
            int cupoRestante = cupoSobregiro - sobregiroUsado;
            mensaje += "\n Está usando el cupo del Sobregiro disponble. \n"
                    + "Sobregiro utilizado: $" + sobregiroUsado + "\n"
                    + "Cupo restante: $" + cupoRestante;
        }
        
        return mensaje;
    }
}
    
