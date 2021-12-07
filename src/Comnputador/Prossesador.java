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
public class Prossesador {
    
    
    int qtdeDeNucleos;
    
    
    public Prossesador(){
        qtdeDeNucleos = 4;
    }
    public Prossesador(int qtdeDeNucleos){
        this.qtdeDeNucleos = qtdeDeNucleos;
    }

    public int getQtdeDeNucleos() {
        return qtdeDeNucleos;
    }

    public void setQtdeDeNucleos(int qtdeDeNucleos) {
        this.qtdeDeNucleos = qtdeDeNucleos;
    }
    
    
    
    
    
    
    
}
