package ioc.m3.uf2.eac6.joc;
import ioc.m3.uf2.biblioteca.*;

public class SortidaPantalla {
    Utilitats util = new Utilitats();
    gestorDadesJoc gestor = new gestorDadesJoc();
    

    
    public void carregaPantalla(DadesJoc dades){
        netejaPantalla();
        mostraRetol();
        mostraDadesPartida(dades);
        mostraDipositLletres(dades.dipositLletres);
        demanaParaules(dades);
        
    }
    
    /**
     * Funció que mostra el missatge demanant paraules a l'usuari
     * De moment, i per fer proves, no permet introduir paraules
     * @param dades variable de tipus DadesJoc amb les dades de la partida
     */
    public void demanaParaules(DadesJoc dades){
        // falta crida a generaString();
        if (dades.paraulesDescobertes.length == dades.paraulesAmagades.length){
            System.out.println("Enhorabona! Has trobat totes les paraules amagades. Partida finalitzada.");
        }
        else if (dades.torn > Utilitats.MAX_TORNS){
            System.out.println("Has esgotat tots els torns. Partida finalitzada.");
        }
        else {
        System.out.println("Intenta escriure totes les paraules que puguis combinant les ");
        System.out.println("lletres. Escriu les paraules separades per espais i prem [Entrar] ");
        System.out.println("per finalitzar el torn.");
        //int nombreParaules = 0;
        //String[] paraules = new String[nombreParaules];
        //Mostrar text demanant paraules
        //Registrar les paraules
        
        //i finalment retornar les paraules registrades
        }
    }
    
    /**
     * Funció que mostra missatge informatiu i el dipòsit de lletres que
     * l'usuari pot utilitzar
     * @param dipositLletres array amb les lletres disponibles
     */
    public void mostraDipositLletres(char[] dipositLletres){
        // falta crida a generaString();
        System.out.println("Lletres que pots utilitzar: ");
        util.pintaDiposit(dipositLletres);
        System.out.println();
        
    }
    
    /**
     * Funció que mostra les dades relatives a la partida
     * @param dades variable de tipus DadesJoc amb les variables de la partida
     * @param dades variable de tipus DadesJoc amb la informació de partida
     */
    public void mostraDadesPartida(DadesJoc dades){
        // falta crida a generaString();
        util.mostraTorn(dades);
        util.mostrarPunts(dades);
        util.mostraParaulesDescobertes(dades);
        System.out.println();
                
    }
    
    /** 
     * Mostra el rètol amb el nom del joc
     * 
     */
    public void mostraRetol(){
        //Mostra linees maques
        //Mostra títol
        //Mostra descripció potser
        //Mostra linees maques again
    }
    
    public void mostraRetol(String[] linees, char caracter, int amplada){
        Utilitats util = new Utilitats();
        
        //Mostra una linea de caracters equivalent a l'amplada
        System.out.println(util.generaString(caracter, amplada));
        for (int i = 0;i<linees.length;i++){
            //Mostra dos caracters
            System.out.print(caracter + "" + caracter);
            //Calcula quants espais en blanc ha de posar
            int amountOfSpaces = ((amplada - linees[i].length())/2)-2;
            for (int i2 = 0;i2<amountOfSpaces;i2++) { System.out.print(" "); }
            //Posa el missatge corresponent
            System.out.print(linees[i]);
            //Calcula quant espai queda per posar caracters
            int spaceLeft = (amplada - (amountOfSpaces + linees[i].length() + 2));
            //Posarà tants espais en blanc com queda d'espai MENYS 2 per posar els
            // últims 2 caràcters (com a la linea 89)
            for (int i2 = 0;i2<(spaceLeft-2);i2++){ System.out.print(" "); }
            System.out.print(caracter + "" + caracter + "\n");
        }
        System.out.println(util.generaString(caracter, amplada));
    }

    /**
     * Neteja la pantalla
     */
    public void netejaPantalla(){
        //Brut però visualment funciona perfectament.
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
