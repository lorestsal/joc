package ioc.m3.uf2.eac6.joc;

public class execucio {
    /**
     * Comprova que les lletres de les paraules coincideixen amb les lletres
     * valides del joc
     * Per cada paraula, verificar si hi ha correspondència injectiva entre les seves lletres 
     * i les lletres del dipòsit encara no aparellades.
     * Per cada lletra de la paraula a verificar trobar una lletra equivalent al dipòsit 
     * que encara no hagi estat aparellada amb anterioritat a alguna altra lletra.
     * Recórrer les lletres del dipòsit fins que trobem una lletra lliure (no associada a cap altra 
     * lletra de la proposta) equivalent.
     * Si es troba Marcar la lletra trobada com relacionada per impedir futures cerques.
     * Si no es troba finalitzar la funció i emetre un veredicte negatiu i actualitzar torns.
     * Si no s'ha emes ja un veredicte negatiu emetre'l positiu
     * @param propostaParaules es l'array de paraules proposades per l'usuari
     * @param dipositLletres es l'array de lletres válides de la partida
     * @return un boleà que indica si la proposta es vàlida
     */
    public boolean validarProposta(String [] propostaParaules, char [] dispositLletres){
        boolean ret=false;
        //A CODIFICAR... 
        return ret;
    }
    
    /**
     * Compara les paraules de la cadena amb les paraules del diccinari
     * Crear un conjunt buit de paraules vàlides on afegir les paraules que es vagin validant
     * Per cada paraula del conjunt de paraules afegir-la al conjunt de paraules vàlides o descartar-la.
     * Cercar	la paraula al diccionari.
     * Si es troba al diccionari afegir la paraula al conjunt de paraules vàlides
     * Actualitzar puntuacions
     * 
     * @param paraulesProposades son les paraules a recercar al diccionari
     * @param diccionari es el diccionari de paraules
     * @param paraulesDescobertes array de paraules descobertes per l'usuari
     */
    public void comparaDiccionari(String [] paraulesProposades, String [] diccionari, String paraulesDescobertes []){
        //A CODIFICAR... 
    }
    
    /**
     * Actualitza els punts de la partida
     * 
     * S’actualitzaran 	les puntuacions	
     * Es comptarà el número de lletres	
     * Es multiplicarà pel nombre de punts en funció del torn actual
     * 
     * @param punts nombre de punts acumulats durant el joc
     * @param torn  nombre de torns consumits
     * @param nombreLletresParaulaEncertada nombre de lletres de la paraula encertada
     */
    public void actaulitzaPunts(int punts, int torn, int nombreLletresParaulaEncertada){
        //A CODIFICAR... 
        
    }
    
    /**
     * Actualitza les lletres del diposit
     * 
     * Recorre totes les paraules actualitzant el dipòsit amb les lletres de les paraules.
     * Per cada paraula actualitzar el dipòsit amb les seves lletres.
     * Recorre totes les lletres de la paraula actualitzant el dipòsit
     * Per cada lletra cercar en el dipòsit una lletra idèntica i eliminar-la, substituint-la per un espai en blanc.
     * 
     * @param dipositLletres es l'array de lletres válides de la partida
     * @param paraulesDescobertes array de paraules descobertes per l'usuari
     * 
     */
    public void actualitzaLletres(char dipositLletres [], String paraulesDescobertes []){
        //A CODIFICAR... 
        
    }
}


