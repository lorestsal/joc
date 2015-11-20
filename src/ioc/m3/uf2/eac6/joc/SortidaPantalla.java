/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterficieConsola;

/**
 *
 * @author Lorenz Harfst
 */
public class SortidaPantalla {
    
    /**
     * Mostra una array de Strings per pantalla separada per pals (|)
     * @param array 
     */
    void printArray(String[] array){
         System.out.print("|");
        for (int i = 0;i<array.length;i++){
            System.out.print(" " + array[i] + " |");
        }
    }
    /**
     * Mostra un missatge en una linea per pantalla.
     * @param missatge 
     */
    void mostraMissatge(String missatge){
        
    }
    /**
     * Neteja la pantalla
     */
    void netejaPantalla(){
        
    }
    /**
     * Mostra el rétol del títol del joc
     */
    void mostraRetol(){
        //Mostra linees maques
        //Mostra títol
        //Mostra descripció potser
        //Mostra linees maques again
    }
    /**
     * Imprimeix per pantalla un text amb el torn
     * @param torn 
     */
    void mostraTorn(int torn){
        //Mostrar text descriptiu
        //Mostrar torn
    }
    /**
     * Imprimeix per pantalla un text amb els punts
     * @param punts 
     */
    void mostraPunts(int punts){
        //Mostrar text descriptiu
        //Mostrar punts del jugador
    }
    /**
     * Mostra les paraules descobertes fins ara
     * @param paraules 
     */
    void mostraParaulesDescobertes(String[] paraules){
        //Mostrar text descriptiu
        //Mostrar l'array
    }
    /**
     * Mostra les lletres que el jugador pot utilitzar
     * @param lletres 
     */
    void mostraDipositLletres(char[] lletres){
        //Mostrar text d'escriptiu
        //Mostrar l'array
    }
    /**
     * Demana paraules al jugador
     * @return 
     */
    String[] demanaParaules(){
        int nombreParaules = 0;
        String[] paraules = new String[nombreParaules];
        //Mostrar text demanant paraules
        //Registrar les paraules
        
        //i finalment retornar les paraules registrades
        return paraules;
    }
}
