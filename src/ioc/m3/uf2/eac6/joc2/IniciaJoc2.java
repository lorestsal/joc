package ioc.m3.uf2.eac6.joc2;
import ioc.m3.uf2.biblioteca.*;
    /**
     * Realitza les operacions necessaries per inicialitzar el joc,
     * és a dir, extreure les paraules del diccionari i convertir-les
     * en un dipòsit de lletres
     * 
     */
public class IniciaJoc2 {
    
    /**
     * Obté un nombre indeterminat de paraules a l'atzar, el nombre de lletres 
     * de les quals suma el valor indiocat al parámetre totalLletres
     * @param diccionari array de paraules d'on extreure les paraules a 
     * l'atzar (diccionari).
     * @param totalLletres nombre de lletres que caldrà acumular durant la 
     * selecció de les paraules.
     * @return array de paraules seleccionades per jugar la partida
     */
    private String[] extreureParaulesDiccionari(String[] diccionari, int totalLletres){
        String[] paraulesObtingudes = new String[totalLletres];
        int nParaulesObtingudes=0;
        while(totalLletres>0){
            int pos = obtenirPosParaulaALAtzar(diccionari, totalLletres, paraulesObtingudes);
            paraulesObtingudes[nParaulesObtingudes]=diccionari[pos];
            totalLletres-=paraulesObtingudes[nParaulesObtingudes].length();
            nParaulesObtingudes++;
        }
        
        return redimensionaString(paraulesObtingudes, nParaulesObtingudes);
    }
       
    /**
     * Redimensiona la mida de la  colecció de les paraules a la mida indicada 
     * en el paràmetre de la segona posició.
     * @param paraules es la colecció de paraules a redimensionar
     * @param mida ess la mida a la que es desitja la colecció.
     * @return retorna la nova colecció de la mida correcta.
     */
    public String[] redimensionaString(String[] paraules, int mida){
        String[] ret = new String[mida];
        for(int i=0; i<mida && i<paraules.length; i++){
            ret[i]=paraules[i];
        }
        return ret;
    }
    

    /**
     * ObtÃ© la posiciÃ³ d'una paraula de la colÂ·lecciÃ³ de paraules passades per 
     * parÃ metre que compleixi:<br/>
     * A) que la seva mida (nombfre de lletres) no sobrepassi la quantitat 
     * indicada per midaMaxima.<br/>
     * B) que no existeixi a la colÂ·lecciÃ§Ã³ de paraules passada en tercera posiciÃ³
     * @param paraules Ã©s la colÂ·lecciÃ³ d'on escolir les paraules
     * @param midaMaxima Ã©s la mida mÃ xima que la paruala pot fer.
     * @param ignorarEntrades sÃ³n les paraules a ignorar. Ã‰s a dir, la paraula 
     * escollida no pot estar continguda en aquesta colÂ·lecciÃ³. CaldrÃ  ignorar 
     * les durant la selecciÃ³.
     * @return la posiciÃ³ de la paraula seleccionada que compleix tot l'explicat.
     */
    private int obtenirPosParaulaALAtzar(String[] paraules, int midaMaxima, String[] ignorarEntrades){
        int posRandom = nanoRandom(paraules.length);
        int i=posRandom;
        boolean volta=false;
        
        while(!volta && (paraules[i].length()>midaMaxima 
                     || hiHaParaula(paraules[i], ignorarEntrades))){            
            i++;
            if(i==paraules.length){
                i=0;
            }
            volta = i==posRandom;
        }
        if(volta){
            i=-1;
        }
        return i;
    }
    
    /**
     * ObtÃ© i retorna un valor random de tipus enter, el qual oscilÂ·larÃ  entre 
     * el valor zero (inclÃ²s) i el valor limitValue (no inclÃ²s).
     * @param limitValue Ã©s el valor lÃ­mit superior del rang retornat per la funciÃ³
     * @return 
     */
    private int nanoRandom(int limitValue){
        long nano = System.nanoTime();
        int ret = (int) (nano%limitValue);
        if(ret<0){
            ret*=-1;
        }
        return ret;
    }
    
    /**
     * Comprova si la paruala passada per parÃ metre es troba a la llista de 
     * parules del segon parÃ metre
     * @param paraula Ã©s paraula a cercar
     * @param paraules Ã©s la llistra on cercar
     * @return 
     */
     private boolean hiHaParaula(String paraula, String[] paraules){
        boolean ret=false;
        int ind=0;
        while(!ret && ind<paraules.length){
            ret= paraules[ind]!=null && paraules[ind].equalsIgnoreCase(paraula);
            ++ind;
        }
        return ret;
    }
    

   
}
