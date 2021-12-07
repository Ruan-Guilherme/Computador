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
public class Computador {
    
   
    private HD hd;
    private Ram ram;
    private PlacaDeVideo PlacadeVideo;
    private Prossesador prossesador;
         
    
    public Computador(){
        hd = new HD();
        ram = new Ram();
        PlacadeVideo = new PlacaDeVideo();
        prossesador = new Prossesador();
    }
    public Computador(int TamnhoMemoria, int Ram, int eqteDeNUcleos, String modelo){
        hd = new HD(TamnhoMemoria);
        ram = new Ram(Ram);
        PlacadeVideo = new PlacaDeVideo(modelo);
        prossesador = new Prossesador(eqteDeNUcleos);
    }
    
    public void ImprimirDadosComputador(){
        System.out.println("Tamanho da Memoria: "+hd.TamanhoMemoria);
        System.out.println("Tamanho da memoria Ram: "+ram.ram);
        System.out.println("Modelo da Placa de Video: "+PlacadeVideo.Modelo);
        System.out.println("Quantidade de Nucleos: "+prossesador.qtdeDeNucleos);
    }
    

   
    
    
    
    
}
