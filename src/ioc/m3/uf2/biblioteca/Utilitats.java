package ioc.m3.uf2.biblioteca;
import ioc.m3.uf2.eac6.joc.*;

/**
 * Biblioteca amb funcions útils a utilitzar durant el programa
 */
public class Utilitats {
    // Constnts per facilitar la implementació
            public static final int MAX_TORNS=6;
            public static final int MIDA_DIPOSIT=30;
            public static final double PUNTS_TORN_1=0.5;
            public static final double PUNTS_TORN_2=0.2;
            public static final double PUNTS_TORN_3=0.1;
            
    
    /** 
     * Mostra per pantalla la informació relativa al torn de la partida
     * @param dadesJoc estructura de tipus DadesJoc amb informació de la partida
     */
    public void mostraTorn(DadesJoc dadesJoc){
        System.out.println("Torn: " + dadesJoc.torn + " de " + MAX_TORNS);
        
    }
    
    /**
     * Mostra per pantalla la informació relativa als punts de la partida
     * @param dadesJoc estructura de tipus DadesJoc amb informació de la partida
     */
    public void mostrarPunts (DadesJoc dadesJoc){
        System.out.println("Puntuació: " + dadesJoc.puntuacio);
    }
    
    /**
     * Mostra les paraules descobertes fins ara
     * @param dades variable de tipus DadesJoc amb la informació de la partida
     */
    public void mostraParaulesDescobertes(DadesJoc dades){
        System.out.println("Paraules descobertes: ");
        if (dades.paraulesDescobertes[0]!=null){
            for (int x = 0; x < dades.paraulesDescobertes.length-1; x++) {
                System.out.println("       " + dades.paraulesDescobertes[x] + ",");            
            }
            System.out.println("       " + dades.paraulesDescobertes[dades.paraulesDescobertes.length-1]);            
        }
        System.out.println();
        
    }

     /**
     * Mostra les lletres que el jugador pot utilitzar
     * @param dipositLletres és l'array del dipòsit de lletres 
     */
    public void pintaDiposit(char[] dipositLletres){
        System.out.print("|");
        for (int i=0; i<9; i++){
            System.out.print(dipositLletres[i] + ", ");
        }
        System.out.println(dipositLletres[9] + "|");
        System.out.print("|");
        for (int i=10; i<19; i++){
            System.out.print(dipositLletres[i] + ", ");
        }
        System.out.println(dipositLletres[19] + "|");
        System.out.print("|");
        for (int i=20; i<29; i++){
            System.out.print(dipositLletres[i] + ", ");
        }
        System.out.println(dipositLletres[29] + "|");
    }
    
    /**
     * Funció que extreu les lletres d'una serie de paraules passades
     * per paràmetre
     * @param paraules array de paraules a extreure les lletres
     * @return lletres array de caracters corresponent a les lletres
     */
    public char[] extreureLletres(String[] paraules) {
        int aux = 0;
        char[] lletres = new char[30];
        // Recorrem totes les paraules de l'array
        for (int i=0; i < paraules.length; i++) {
            // Recorrem totes les lletres de cada paraula
            for (int j=0; j < paraules[i].length(); j++) {
                lletres[aux] = paraules[i].charAt(j);
                aux++;
            }
        }
        return lletres;
    }
    
    /**
     * Funció que desordena les lletres d'un array de caracters
     * @param dipositLletres array de lletres ordenades
     */
    public void obtenirLletresDesordenades(char[] dipositLletres) {
        int n = dipositLletres.length;
        for (int i = 0; i < n; i++) {
            // Calculem un número aleatori entre l'índex (valor mínim) i la longitud de l'array (valor màxim)
	    int random = (int) (Math.random()* (n - i)) + i;
	    // Creem una variable randomElement que tindrà per valor el caracter que hi havia a la posició "random"
            char randomElement = dipositLletres[random];
	    // El nou valor a la posició "random" és el que hi havia a la posició index
            dipositLletres[random] = dipositLletres[i];
            // I el nou valor a la posició index és el que hi havia a la posició "random" (guardat a randomElement)
	    dipositLletres[i] = randomElement;
	}
    }
    
    /**
     * Actualitza el diposit de lletres (primer paràmetre), substituïnt cada 
     * una de les lletres contingudes a la col·lecció de paraules (segon
     * paràmetre) per espais en blanc.
     * @param dades variable de tipus DadesJoc
     */
    public void actualitzarDiposit(DadesJoc dades){
        for(int i=0; i<dades.paraulesDescobertes.length; i++){
            actualitzarDipositAmbParaula(dades.dipositLletres, dades.paraulesDescobertes[i]);
        }
    }
    
    /**
     * Actualitza el diposit de lletres (primer paràmetre), substituïnt cada 
     * una de les lletres contingudes a la paraula passada en segon lloc  per 
     * espais en blanc.
     * @param lletres és el diposit de lletres del joc
     * @param paraula és la paraula usada per actualitzar el 
     * diposit.
     */
    public void actualitzarDipositAmbParaula(char[] lletres, String paraula){
        for(int iPar=0; iPar<paraula.length(); iPar++){
            actualitzarDipositAmbLLetra(lletres, paraula.charAt(iPar));
        }
    }
    
    /**
     * Actualitza el diposit de lletres (primer paràmetre), substituïnt la lletra
     * passada en segon lloc per un espai en blanc.
     * @param lletres
     * @param lletra 
     */
    public void actualitzarDipositAmbLLetra(char[] lletres, char lletra){
        int i=0; 
        boolean ret=false;
        while(!ret && i<lletres.length){
            if(lletres[i]==lletra){
                lletres[i]=' ';
                ret=true;
            }else{
                ++i;
            }
        }
    }
    
    /**
     * Genera un string fet de cert caracter amb certa llargada.
     * @param caracter caracter a omplir la cadena generada
     * @param llargadaString mida de la cadena a generar
     * @return String generat per caracters indicats.
     */
    public String generaString(char caracter, int llargadaString){
        String output = "";
        for (int i = 0;i < llargadaString; i++){
            output += caracter;
        }
        return output;
    }
    
    /**
     * Segurament no es faci servir i s'elimini al final del projecte.
     * Comprova que el String (input) sigui igual o menor a midaMaxima.
     * En cas contrari se li borraràn caràcters
     * començant pel costat("esquerra", "dreta") indicat.
     * Si hi han caràcters borrats es trobaràn punts suspensius a la zona afectada.
     * @param input
     * @param midaMaxima
     * @param costat
     * @return String retallat (si és necessari).
     */
    String comprovaMidaString(String input, int midaMaxima, String costat){
        String retallat = "";
        // falta desenvolupar
        return retallat;
    }
    

    
}
