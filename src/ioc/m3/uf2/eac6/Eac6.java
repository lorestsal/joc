package ioc.m3.uf2.eac6;
import ioc.m3.uf2.biblioteca.*;
import ioc.m3.uf2.eac6.joc.*;


public class Eac6 {
    public static void main(String[] args) {
        Eac6 prg = new Eac6();
        prg.prova();
    }
    
    /**
     * Funció de prova per comprovar la funcionalitat de les pantalles
     */
    void prova(){
        SortidaPantalla partida = new SortidaPantalla();
        gestorDadesJoc gestor = new gestorDadesJoc();
        DadesJoc dadesPartida = gestor.gestorDades();
        Utilitats utilitat = new Utilitats();
        // Creem string amagades amb paraules del diccionari que sumen 30 chars
        String[] amagades = {"ABADESSA", "IDOL", "PLORAR", "INCLOURE", "BATA"};
        // Assignem el valor a paraulesAmagades del tipus de dada DadesJoc
        dadesPartida.paraulesAmagades = amagades;
        // Inicialitzem diposit de lletres on guardarem les letres de les paraules
        // char[] dipositLletres = new char[gestorDadesJoc.MIDA_DIPOSIT];
        // Extreiem lletres de les paraulesAmagades i les guardem al diposit
        dadesPartida.dipositLletres = utilitat.extreureLletres(dadesPartida.paraulesAmagades);
        // Desordenem les lletres de l'array
        utilitat.obtenirLletresDesordenades(dadesPartida.dipositLletres);
        // Carreguem pantalla del joc amb dades inicials
        partida.carregaPantalla(dadesPartida);
        
        // Modifiquem dades per mostrar resultat durant la partida
        dadesPartida.torn = 3;
        dadesPartida.puntuacio = 12;
        String[] encertades = {"BATA", "IDOL", "INCLOURE"};
        dadesPartida.paraulesDescobertes = encertades;
        // Actualitzem dipòsit
        utilitat.actualitzarDiposit(dadesPartida);
        // Carreguem informació de partida
        partida.carregaPantalla(dadesPartida);
        
        // Modifiquem dades per mostrar resultat un cop esgotats els torns
        dadesPartida.torn = 7;
        partida.carregaPantalla(dadesPartida);
        
        
        // Modifiquem dades per mostrar resultat un cop encertades totes les paraules
        dadesPartida.torn = 5;
        String[] descobertes = {"ABADESSA", "IDOL", "PLORAR", "INCLOURE", "BATA"};
        dadesPartida.paraulesDescobertes = descobertes;
        utilitat.actualitzarDiposit(dadesPartida);
        partida.carregaPantalla(dadesPartida);
    }
    
}
