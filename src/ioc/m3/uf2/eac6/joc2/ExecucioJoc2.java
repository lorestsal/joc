package ioc.m3.uf2.eac6.joc2;

public class ExecucioJoc2 {
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
    private boolean validarProposta(String[] propostaParaules, char[] dipositLletres){
        boolean ret=true;
        boolean[] marques = new boolean[dipositLletres.length];
        for(int i=0; ret && i<propostaParaules.length; i++){
            ret = validarParaula(propostaParaules[i], dipositLletres, marques);
        }
        return ret;
    }
    
        /**
     * Indica si totes les lletres de la paraula passada en el primer 
     * parÃ metres es troben contingudes dins el diposit (segon parÃ metre).
     * @param paraules Ã©s la paraula a comprovar.
     * @param diposit Ã©s el diposit de lletres on comprovar     
     * @param amagades Ã©s una colÂ·lecciÃ³ de valors lÃ²gics que indica si anteriorment
     * ja s'ha trobat una correspondÃ¨ncia amb la lletra que es troba a la mateixa 
     * posiciÃ³ que el valor i per tant no Ã©s pot considerar un lletra vÃ lida.
     * @return si la comprovaciÃ³ Ã©s o no correcta.
     */
    private boolean validarParaula(String paraula, char[] diposit, boolean[] amagades){
        boolean ret=true;
        for(int j=0; ret && j<paraula.length(); j++){
            ret = validaLletra(paraula.charAt(j), diposit, amagades);
        }        
        return ret;
    }
    /**
     * Indica si la lletra de la paraula passada en el primer 
     * parÃ metre es troba continguda dins el dipÃ²sit (segon parÃ metre).
     * @param lletra Ã©s la lletra a comprovar
     * @param diposit Ã©s el diposit de lletres on comprovar     
     * @param amagades Ã©s una colÂ·lecciÃ³ de valors lÃ²gics que indica si anteriorment
     * ja s'ha trobat una correspondÃ¨ncia amb la lletra que es troba a la mateixa 
     * posiciÃ³ que el valor i per tant no Ã©s pot considerar un lletra vÃ lida.
     * @return si la comprovaciÃ³ Ã©s o no correcta.
     */
    private boolean validaLletra(char lletra, char[] diposit, boolean[] amagades){
        boolean ret=false;
        int pos=0;
        while(!ret && pos<diposit.length){
            if(!amagades[pos] && diposit[pos]==lletra){
                ret = true;
                amagades[pos]=true;
            }
            pos++;
        }
        return ret;
    }
    
    /**
     * Troba i retorna quines paraules, d'un conjunt de paraules (primer 
     * parÃ metre) sÃ³n en un diccionari (segon parÃ metre).
     * @param paraules Ã©s el conjunt de paraules a verificar
     * @param diccionari Ã©s el diccionari on fer la verificaciÃ³
     * @return nomÃ©s el subconjunt de paraules que es troba dins el diccionari.
     */
    private String[] comparaDiccionari(String[] paraules, String[] diccionari){
        String[] ret = new String[paraules.length]; //com a mÃ xim hi hauran paraules.length paraules correctes.
        int mida=0;
        for(int i=0; i<paraules.length; i++){
            if(existeixParaula(paraules[i], diccionari)){
                ret[mida]=paraules[i];
                mida++;
            }
        }
        
        ret = redimensionaColleccioStrings(ret, mida);
        return ret;
    }

    /**
     * Comprova si la paraula passada en primer lloc Ã©s dins el diccionari 
     * (segon parÃ metre).
     * @param paraula Ã©s la paraula a comprovar
     * @param diccionari Ã©s le diccionari on comprovar
     * @return cert si la paraula es troba al diccionari i fals en cas contrari.
     */
    private boolean existeixParaula(String paraula, String[] diccionari){
        boolean ret=false;
        int ind=0;
        while(!ret && ind<diccionari.length){
            ret= diccionari[ind]!=null && diccionari[ind].equalsIgnoreCase(paraula);
            ++ind;
        }
        return ret;
    }
    
     /**
     * Redimensiona la mida de la  colecciÃ³ de les paraules a la mida indicada 
     * en el parÃ metre de la segona posiciÃ³.
     * @param paraules Ã©s la colÂ·lecciÃ³ de paraules a redimensionar
     * @param mida Ã©s la mida a la que es desitja la colÂ·lecciÃ³.
     * @return retorna la nova colÂ·lecciÃ³ de la mida correcta.
     */
     public String[] redimensionaColleccioStrings(String[] paraules, int mida){
        String[] ret = new String[mida];
        for(int i=0; i<mida && i<paraules.length; i++){
            ret[i]=paraules[i];
        }
        return ret;
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

