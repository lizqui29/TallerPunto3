/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Validacion {
    public boolean validarDia (int dia) {
        return dia >= 1 && dia <= 31;
    }
   
     public boolean validarAño(int año) {
        return año > 0 && año <= 2025;
    }
    
}
