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
public class HD {
    
    int TamanhoMemoria;

    public HD(){
        
       TamanhoMemoria = 1000; 
    }
    public HD (int TamanhoMemoria){
        this.TamanhoMemoria = TamanhoMemoria;
    }
    
    
    public int getTamanhoMemoria() {
        return TamanhoMemoria;
    }

    public void setTamanhoMemoria(int tamanhoMemoria) {
        this.TamanhoMemoria = tamanhoMemoria;
    }
 
    
    
    
    
    
}
