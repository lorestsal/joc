package ioc.m3.uf2.biblioteca;
import ioc.m3.uf2.biblioteca.*;

/**
 * Gestor de dades per inicialitzar les instàncies
 * 
 */

public class GestorDadesJoc {
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
            contenidorDades.paraulesProposades = new String[Utilitats.MIDA_DIPOSIT];
            contenidorDades.paraulesAmagades = new String[Utilitats.MIDA_DIPOSIT];
            contenidorDades.paraulesDescobertes = new String [Utilitats.MIDA_DIPOSIT];
            contenidorDades.dipositLletres = new char [Utilitats.MIDA_DIPOSIT];
            contenidorDades.puntuacio=0;
            return contenidorDades;
        
        }
}
