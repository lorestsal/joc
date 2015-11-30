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
    public String[] extreureParaulesDiccionari(String[] diccionari, int totalLletres){
        Utilitats util = new Utilitats();
        String[] paraulesObtingudes = new String[totalLletres];
        int nParaulesObtingudes=0;
        while(totalLletres>0){
            int pos = obtenirPosParaulaALAtzar(diccionari, totalLletres, paraulesObtingudes);
            paraulesObtingudes[nParaulesObtingudes]=diccionari[pos];
            totalLletres-=paraulesObtingudes[nParaulesObtingudes].length();
            nParaulesObtingudes++;
        }
        
        paraulesObtingudes = util.toUpperCase(redimensionaString(paraulesObtingudes, nParaulesObtingudes));
        return paraulesObtingudes;
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
     * Obté la posició d'una paraula de la col·lecció de paraules passades per 
     * paràmetre que compleixi:
     * A) que la seva mida (nombre de lletres) no sobrepassi la quantitat 
     * indicada per midaMaxima.
     * B) que no existeixi a la col·lecció de paraules passada en tercera posició
     * @param paraules array de paraules d'on escolir les paraules
     * @param midaMaxima mida màxima que la paruala pot fer
     * @param ignorarEntrades paraules a ignorar. 
     * @return la posició de la paraula seleccionada que compleix tot l'explicat.
     */
    private int obtenirPosParaulaALAtzar(String[] paraules, int midaMaxima, String[] ignorarEntrades){
        Utilitats util = new Utilitats();
        int posRandom = util.nanoRandom(paraules.length);
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
     * Comprova si la paruala passada per paràmetre es troba a la llista de 
     * parules del segon paràmetre
     * @param paraula paraula a cercar
     * @param paraules llistra on cercar
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
