package ioc.m3.uf2;

    /**
     * Realitza les operacions necessaries per inicialitzar el joc,
     * és a dir, extreure les paraules del diccionari i convertir-les
     * en un dipòsit de lletres
     * 
     */
public class IniciaJoc {
    
    /**
     * Realitza les operacions necessaries per inicialitzar el joc,
     * és a dir, extreure les paraules del diccionari i convertir-les
     * en un dipòsit de lletres
     * 
     * @param diccionari array amb el conjunt de paraules
     * @param mida és la mida amb la que inicialitzarem l'array per poder començar a 
     * treballar amb ell (serà la constant MIDA_DIPOSIT)
     * @return paraules array amb les paraules extretes
     */
    public String[] extreureParaules(String [] diccionari, int mida){
        // Inicialitzem l'array de paraules amb mida màxima passada per paràmetre
        String [] paraules = new String[mida];
        // A CODIFICAR... extracció de paraules que acompleixin amb les especificacions
        
        // Retornem l'array de paraules extretes
        return paraules;
    }
        
    /**
     * Funció que extreu les lletres d'un array de paraules
     * 
     * @param paraules és el conjunt de paraules que rep la funció
     * @param   mida és la mida que tindrà l'array (constant MIDA_DIPOSIT)
     * @return  lletres es l'array de lletres que composaven les paraules
     */
    public char[] extreureLletres(String [] paraules, int mida){
        // Inicialitzem l'array de lletres amb mida màxima "mida"
        char [] lletres = new char[mida];
        // A CODIFICAR...  Extreure lletres del conjunt paraules i guardar-ho a l'array
        
        // Retornem array de lletres extretes
        return lletres;
    }
    
   /**
    * Rep un conjunt de lletres i les desordena
    *
    * @param lletres matriu de lletres que hem de desordenar
    */ 
   public void desordenarLletres(char [] lletres){
        //A CODIFICAR... Desordenar lletres
   }
   
}
