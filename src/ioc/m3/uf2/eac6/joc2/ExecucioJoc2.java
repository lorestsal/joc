package ioc.m3.uf2.eac6.joc2;

import ioc.m3.uf2.biblioteca.*;

public class ExecucioJoc2 {
    
    public void joc2(String[] paraules){
        IniciaJoc2 inicia = new IniciaJoc2();
        GestorDadesJoc gestor = new GestorDadesJoc();
        DadesJoc dadesPartida = gestor.gestorDades();
        Diccionari diccio = new Diccionari();
        SortidaPantallaJoc2 sortidaPantalla = new SortidaPantallaJoc2();
       // Utilitats util = new Utilitats();
        dadesPartida.paraulesAmagades=inicia.extreureParaulesDiccionari(diccio.diccionari, Utilitats.MIDA_DIPOSIT);
        sortidaPantalla.carregaPantalla(dadesPartida);
        boolean aux = validarProposta(dadesPartida.paraulesAmagades,dadesPartida.dipositLletres);
        if (aux == false) {
            dadesPartida.torn++;
        } else {
            
        }
       
    }
    
    
    
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
     * paràmetres es troben contingudes dins el diposit (segon paràmetre).
     * @param paraula la paraula a comprovar.
     * @param diposit el diposit de lletres on comprovar     
     * @param amagades un array de valors lògics que indica si anteriorment
     * ja s'ha trobat una correspondencia amb la lletra que es troba a la mateixa 
     * posició que el valor i per tant no es pot considerar un lletra vàlida.
     * @return si la comprovació és o no correcta.
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
     * parÃ metre es troba continguda dins el diposit (segon parametre).
     * @param lletra la lletra a comprovar
     * @param diposit el diposit de lletres on comprovar     
     * @param amagades un array de valors lògics que indica si anteriorment
     * ja s'ha trobat una correspondencia amb la lletra que es troba a la mateixa 
     * posició que el valor i per tant no es pot considerar un lletra vàlida.
     * @return si la comprovació és o no correcta.
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
     * paràmetre) son en un diccionari (segon paràmetre).
     * @param paraules el conjunt de paraules a verificar
     * @param diccionari el diccionari on fer la verificació
     * @return el subconjunt de paraules que es troba dins el diccionari.
     */
    private String[] comparaDiccionari(String[] paraules, String[] diccionari){
        String[] ret = new String[paraules.length]; //com a màxim hi hauran paraules.length paraules correctes.
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
     * Comprova si la paraula passada en primer lloc és dins el diccionari 
     * (segon paràmetre).
     * @param paraula la paraula a comprovar
     * @param diccionari el diccionari on comprovar
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
     * Redimensiona la mida de la colecció de les paraules a la mida indicada 
     * en el paràmetre de la segona posició.
     * @param paraules array de paraules a redimensionar
     * @param mida la mida a la que es desitja la colÂ·lecció.
     * @return retorna array de la mida correcta.
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
     * Es comptarà el número de lletres	
     * Es multiplicarà pel nombre de punts en funció del torn actual
     * S'actualitzarà la puntuació
     * 
     * @param joc DadesJoc es pot passar com a paràmetre per actualitzar els punts
     * @param torn  nombre de torns consumits
     * @param paraulesEncertades array amb les paraules encertades
     */
    public void actaulitzaPunts(DadesJoc joc, int torn, String[] paraulesEncertades){
        Double puntuacioGenerada = new Double(0.0);
        Utilitats utilitat = new Utilitats();
        int nombreLletres = utilitat.comptaLletresArray(paraulesEncertades);
        
        switch (torn) {
            case 1:
               //0.5 punts per lletra
               puntuacioGenerada = nombreLletres * 0.5;
            case 2:
               //0.2 punts per lletra
               puntuacioGenerada = nombreLletres * 0.2;
            default:
               //0.1 punts per lletra
               puntuacioGenerada = nombreLletres * 0.1;
        }
        
        int output = puntuacioGenerada.intValue();
        joc.puntuacio += output;
    }
    
    public void seguentTorn(DadesJoc joc){
        joc.torn += 1;
    }
    
}
