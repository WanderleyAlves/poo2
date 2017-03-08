/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.metodo_fabrica;

/**
 *
 * @author 20121bsi0449
 */
public class MetodoFabrica {

    public static void main(String[] args) {
        Formato formato;
        formato = FabricaFormato.geraFormato("br.edu.ifes.metodo_fabrica.FormatoPng");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("br.edu.ifes.metodo_fabrica.FormatoJpeg");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("br.edu.ifes.metodo_fabrica.FormatoGif");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("br.edu.ifes.metodo_fabrica.FormatoBmp");
        formato.gera();
    }    
}
