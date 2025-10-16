/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.bancofinanciero;


import javax.swing.JOptionPane;
import Modelo.Cuentas;
import Modelo.Calculadora;
import Modelo.CuentaAhorros;
import Modelo.CuentaCorriente;
import Modelo.Validacion;

/**
 *
 * @author Usuario
 */
public class BancoFinanciero {
    
    private static Validacion validacion = new Validacion();
    static int tipoCuenta;
    static CuentaAhorros ahorros;
    static CuentaCorriente corriente;

    public static void main(String[] args) {
        System.out.println("Hello World!");

    int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Bienvenido a tu cuenta de ahorros. \n"
                    + "1. Agregar Datos \n"
                    + "2. Realizar Consignación.\n"
                    + "3. Realizar Retiro.\n"
                    + "4. Mostrar los datos.\n"
                    + "5. Salir.\n"
                    + "Elija una opcion"));

            switch (opcion) {
                case 1:
                    agregarDatos();
                    break;
              
                case 2:
                    realizarConsignacion ();
                    break;
                    
                case 3:
                    realizarRetiro ();
                    break;
                    
                case 4:
                    mostrarDatos ();
                    break; 
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo, muchas gracias por su colaboración, vuelva pronto.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
                    break;
            }
        } while (opcion != 5);
    }
    
   
       public static void agregarDatos() {
        
        tipoCuenta = Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su tipo de cuenta?"
                + "\n 1. Cuenta de Ahorros."
                + "\n 2. Cuenta Corriente."
                + "\n Elija una opcion.:" ));
        
        if(tipoCuenta == 1){
          
            String nombre;
            int codigo;
            int dia;
            String mes;
            int año;
            
            
            nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");     
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta: "));
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día de la fecha de la creación de la cuenta: "));
            mes = JOptionPane.showInputDialog("Ingrese mes de la fecha de la creación de la cuenta: ");
            año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de la fecha de la creación de la cuenta: "));
            ahorros = new CuentaAhorros (nombre, codigo, dia, mes, año, 2000000);
                 if (validacion.validarDia(dia) && validacion.validarAño(año)){
                    JOptionPane.showMessageDialog(null, "Sus datos han sido registrados de manera exitosa");
                }
                 else {
                 JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente, el año hasta el actual, el día hasta el número 31.");}
        }
        
        
        else if (tipoCuenta == 2){
            
            String nombre;
            int codigo;
            int dia;
            String mes;
            int año;

            
            nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");     
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta: "));
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día de la fecha de la creación de la cuenta: "));
            mes = JOptionPane.showInputDialog("Ingrese mes de la fecha de la creación de la cuenta: ");
            año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de la fecha de la creación de la cuenta: "));
            corriente = new CuentaCorriente (nombre, codigo, dia, mes, año, 2000000);
                if (validacion.validarDia(dia) && validacion.validarAño(año)){
                JOptionPane.showMessageDialog(null, "Sus datos han sido registrados de manera exitosa");}
                else {
                    JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente, el año hasta el actual, el día hasta el número 31.");
                }
            
            
           

        } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una opción correspondiente.");
                }
       
    
}
       
       
       
       public static void realizarConsignacion() {
           if (tipoCuenta == 1) {
               int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a consignar"));
               String resultado = ahorros.consignacion(monto);
               JOptionPane.showMessageDialog(null, resultado);
           }
           else if (tipoCuenta == 2) {
               int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a consignar"));
               String resultado = corriente.consignacion(monto);
               JOptionPane.showMessageDialog(null, resultado);
           } else {
              JOptionPane.showMessageDialog(null, "Ingrese una opción correspondiente.");
           }
           
       }
       
       
       
       public static void realizarRetiro () {
           if (tipoCuenta == 1) {
               int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a retirar"));
               String resultado = ahorros.retiro(monto);
               JOptionPane.showMessageDialog(null, resultado);
           }
           else if (tipoCuenta == 2) {
               int monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a retirar"));
               String resultado = corriente.retiro(monto);
               JOptionPane.showMessageDialog(null, resultado);
           } else {
              JOptionPane.showMessageDialog(null, "Ingrese una opción correspondiente.");
           }
           
       }
       
       
       
       public static void mostrarDatos (){
          if (tipoCuenta == 1) {
             String message = "Datos de la cuenta de Ahorros \n"
                     + "Titular de la cuenta: " + ahorros.getNombre() + "\n"
                     + "Numero de cuenta: " + ahorros.getCodigo()  +"\n"
                     + "Saldo: " + ahorros.getSaldo() + "\n"
                     + "Tipo de cuenta: " + ahorros.getTipoCuenta();
          JOptionPane.showMessageDialog(null, message);
       }
          else if (tipoCuenta == 2){
               String message = "Datos de la cuenta de Ahorros \n"
                     + "Titular de la cuenta: " + corriente.getNombre() + "\n"
                     + "Numero de cuenta: " + corriente.getCodigo()  +"\n"
                     + "Saldo: " + corriente.getSaldo() + "\n"
                     + "Tipo de cuenta: " + corriente.getTipoCuenta();
          JOptionPane.showMessageDialog(null, message);
       } else {
              JOptionPane.showMessageDialog(null, "Su cuenta no ha sido registraba, por favor, vuelva a hacer el proceso");
          }
          }

   
}
