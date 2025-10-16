/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cuentas {

    protected String nombre;
    protected int codigo;
    protected int dia;
    protected String mes;
    protected int año;
    protected int saldo;
   

    public Cuentas(String nombre, int codigo, int dia, String mes, int año, int saldo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public int getSaldo() {
        return saldo;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    
    public String getTipoCuenta() {
        return "Cuenta de Ahorro";
    
    }

}
