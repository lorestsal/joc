/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioc.m3.uf2.eac6.joc;

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
        System.out.println("Torn: "+torn+" de "+MAX_TORNS);
    }
    
    /**
     * Imprimeix per pantalla un text amb els punts
     * @param punts 
     */
    void mostraPunts(int punts){
        //Mostrar text descriptiu
        //Mostrar punts del jugador
        System.out.println("Punts aconseguits "+punts);
    }
    
    /**
     * Mostra les paraules descobertes fins ara
     * @param paraulesDescobertes es un array amb les paraules que l'usuari a trobat
     */
    void mostraParaulesDescobertes(String[] paraulesDescobertes){
        //Mostrar text descriptiu
        //Mostrar l'array
        System.out.println("Paraules descobertes:");
        for (int x = 0;x<paraulesDescobertes.length;x++) {
            System.out.print("       " + paraulesDescobertes[x] + ",");            
        }
       
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
