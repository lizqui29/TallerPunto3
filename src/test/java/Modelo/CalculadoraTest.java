/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraTest {
    
  private Calculadora calc;
    @Test
    public void testConsignacionCorrecto () {
        System.out.println("Pruebas del método consignación");
        Calculadora calc = new Calculadora("Alexia Putellas", 82983933, 2, "Octubre", 2015, 2000000);
        String resultado = calc.consignacion(500000);
        
        assertEquals (2500000, calc.getSaldo());
        
    }
    
    @Test
    public void testConsignacionError () {
        System.out.println("Pruebas del método consignación");
        Calculadora calc = new Calculadora("Juanito Golondrina", 293493, 1, "Diciembre", 2024, 2000000);
        String resultado = calc.consignacion(500000);
        
        assertEquals (3000000, calc.getSaldo());
        
    }
    
    @Test
    public void testRetiroCorrecto () {
        System.out.println("Pruebas del método retiro");
        Calculadora calc = new Calculadora("Michael Jackson", 323878, 19, "Noviembre", 2019, 2000000);
        String resultado = calc.retiro(500000);
        
        assertEquals (1500000, calc.getSaldo());
        
    }
    
    @Test
    public void testRetiroError () {
        System.out.println("Pruebas del método retiro");
        Calculadora calc = new Calculadora("Laura Gonzalez", 43353, 10, "Septiembre", 2021, 2000000);
        String resultado = calc.retiro(500000);
        
        assertEquals (3000000, calc.getSaldo());
        
    }
}
