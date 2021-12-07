/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comnputador;

/**
 *
 * @author IFSC
 */
public class Maquina {
    
    public static void main(String[] args) {
        Computador comp = new Computador();
        Computador comp2 = new Computador(1000, 32, 3, "gb210");
        
        
        comp2.ImprimirDadosComputador();
        
        
    }
    
}
