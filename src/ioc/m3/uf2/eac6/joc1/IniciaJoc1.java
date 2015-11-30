package ioc.m3.uf2.eac6.joc1;

import ioc.m3.uf2.biblioteca.*;


public class IniciaJoc1 {

    
    /**
     * Funció que obté una paraula a l'atzar del diccionari
     * @param paraules array de paraules on escollir
     * @return paraula a l'atzar escollida
     */
    public String obteParaulaAtzar(String[] paraules){
        Utilitats util = new Utilitats();
        int posRandom = util.nanoRandom(paraules.length);
        String paraula = paraules[posRandom];
        return paraula.toUpperCase();
    }
    
}
