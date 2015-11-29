package ioc.m3.uf2.eac6.joc1;
import ioc.m3.uf2.biblioteca.*;

public class ExecucioJoc1 {
    
    /**
     * Funció que executa la partida del joc1
     */
    public void joc1(){
        Diccionari dicc = new Diccionari();
        IniciaJoc1 inicia = new IniciaJoc1();
        SortidaPantallaJoc1 sortida = new SortidaPantallaJoc1();
        String paraula = inicia.obteParaulaAtzar(dicc.diccionari);
        int pistesConcedides = 1;
        int bossaDePunts = 15;
        // Inicialitzem el string pista amb la primera lletra
        char primeraPista = paraula.charAt(0);
        boolean esPotDonarPista;
        
        String pista = "" + primeraPista;
        String proposta = sortida.carregaPantalla(bossaDePunts, pista, paraula);
        bossaDePunts-=1;
        while (!proposta.equals(paraula) && bossaDePunts > 0){
            esPotDonarPista = sortida.esPotDonarNovaPista(paraula, pistesConcedides, bossaDePunts);
            boolean potDemanarPista = sortida.potDemanarNovaPista(bossaDePunts, esPotDonarPista, pistesConcedides, paraula);
                if (potDemanarPista){
                    pistesConcedides+=1;
                    pista= obtePistes(paraula, pistesConcedides, pista);
                    proposta = sortida.carregaPantalla(bossaDePunts, pista, paraula);
                    bossaDePunts-=2;

                }else {    
                    proposta = sortida.carregaPantalla(bossaDePunts, pista, paraula);
                    bossaDePunts-=1;
                }
        }
        // Finalitza partida en cas d'encertar la paraula o esgotar punts
        bossaDePunts-=1;
        sortida.finalPartida(bossaDePunts, proposta, paraula);
    }
   
    /**
     * Funció que obté la cadena de text de la paraula a endevinar amb el nombre
     * de pistes concedides corresponent
     * 
     * @param paraulaAEndevinar
     * @param pistesConcedides
     * @param pista
     * @return String(chars) cadena de text amb de la paraula a endevinar amb el nombre de pistes 
     * concedies corresponent
     */
    public String obtePistes(String paraulaAEndevinar,  int pistesConcedides, String pista) {
        char[] chars;
        chars = new char[pistesConcedides];
        if (!pista.equals(paraulaAEndevinar)){
            for(int i=0; i<pistesConcedides; i++){
                chars[i]=paraulaAEndevinar.charAt(i);
            }
        }
        return new String(chars);
    }
    
    
}
