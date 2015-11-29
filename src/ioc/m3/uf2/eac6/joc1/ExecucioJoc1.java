package ioc.m3.uf2.eac6.joc1;
import ioc.m3.uf2.biblioteca.*;

public class ExecucioJoc1 {
    
    public void joc1(){
        Diccionari dicc = new Diccionari();
        IniciaJoc1 inicia = new IniciaJoc1();
        String paraula = inicia.obteParaulaAtzar(dicc.diccionari);
        int pistesConcedides = 1;
        int bossaDePunts = 15;
        String pista = obtePistes(paraula, pistesConcedides);
        
        
    }
   
    /**
     * Funció que obté la cadena de text de la paraula a endevinar amb el nombre
     * de pistes concedides corresponent
     * 
     * @param paraulaAEndevinar
     * @param pistesConcedides
     * @return String(chars) cadena de text amb de la paraula a endevinar amb el nombre de pistes 
     * concedies corresponent
     */
    public String obtePistes(String paraulaAEndevinar,  int pistesConcedides) {
        char[] chars;
        chars = new char[pistesConcedides];
        for(int i=0; i<pistesConcedides; i++){
            chars[i]=paraulaAEndevinar.charAt(i);
        }
        return new String(chars);
    }
    
    /**
     * Funció que retorna un boleà per determinar si es pot donar una nova pista o no
     * @param paraulaAEndevinar paraula que l'usuari ha d'endevinar
     * @param pistesDonades número de pistes donades a l'usuari
     * @param bossaDePunts punts que acumula l'usuari
     * @return 
     */
    public boolean esPotDonarNovaPista(String paraulaAEndevinar,
        int pistesDonades,
        int bossaDePunts){
        boolean ret;
        ret = pistesDonades<paraulaAEndevinar.length()-1;
        ret = ret && bossaDePunts>2;
        return ret;
    }
    
}
