package ioc.m3.uf2.eac6.joc;
import ioc.m3.uf2.biblioteca.*;
        
/**
 *
 * @author Lorenz Harfst
 * comentario salva
 */
public class SortidaPantalla {
    ProcessaString processa = new ProcessaString();
    
    public static void main(String[] args) {
        SortidaPantalla prg = new SortidaPantalla();
        prg.prova();
    }
    
    void prova(){
        
        
        int mida = gestorDadesJoc.MIDA_DIPOSIT;
        gestorDadesJoc gestor = new gestorDadesJoc();
        DadesJoc dades = gestor.gestorDades();
             
        mostraTorn(dades.torn);
        mostraParaulesDescobertes(dades.paraulesDescobertes);
        String string = processa.generaString('*',30);
        System.out.println(string);
                
    }            
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
        System.out.println("Torn: "+torn+" de "+gestorDadesJoc.MAX_TORNS);
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
        String[] aux = new String[] {"hola"};
        paraulesDescobertes = aux;       
        System.out.println("Paraules descobertes:");
        if (paraulesDescobertes[0]!=null){
            for (int x = 0;x<paraulesDescobertes.length-1;x++) {
                System.out.println("       " + paraulesDescobertes[x] + ",");            
            }
            System.out.println("       " + paraulesDescobertes[paraulesDescobertes.length-1]);            
        }
        System.out.println();
        
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
