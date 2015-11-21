package ioc.m3.uf2.eac6.joc;
import ioc.m3.uf2.biblioteca.DadesJoc;

/**
 *
 * @author estelafranco
 */

/**
 * Gestor de dades per inicialitzar les instàncies
 * 
 */

public class gestorDadesJoc {
    /**
     * Constants per facilitar la implementació
     */
    public static final int MAX_TORNS=6;
    public static final int MIDA_DIPOSIT=30;
    public static final double PUNTS_TORN_1=0.5;
    public static final double PUNTS_TORN_2=0.2;
    public static final double PUNTS_TORN_3=0.1;
    
    DadesJoc dades = gestorDades();
    
    /**
     * Funció per inicialitzar les dades del joc
     * 
     * @return dades, és a dir, l'estructura de dades inicialitzada
     */
        public DadesJoc gestorDades() {
            DadesJoc contenidorDades = new DadesJoc();
            /** La cadena de paraules proposades no podrà tenir més de 30 paraules
            * que equivaldria a 30 paraules d'un únic caracter fins completar
            * els 30 elements que te el dipòsit de lletres
            */
            contenidorDades.torn=1;
            contenidorDades.paraulesProposades = new String[MIDA_DIPOSIT];
            contenidorDades.paraulesAmagades = new String[MIDA_DIPOSIT];
            contenidorDades.paraulesDescobertes = new String [MIDA_DIPOSIT];
            contenidorDades.dipositLletres = new char [MIDA_DIPOSIT];
            
            contenidorDades.puntuacio=0;
            return contenidorDades;
        
        }
}
