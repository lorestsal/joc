package ioc.m3.uf2.eac6.joc;
import ioc.m3.uf2.biblioteca.*;

public class SortidaPantalla {
    Utilitats util = new Utilitats();
    gestorDadesJoc gestor = new gestorDadesJoc();
    String[] titol = {"LLETRES BARREJADES", "Quantes paraules ets capaç de trobar?"};
    

    /**
     * Funció que mostra per pantalla les dades de la partida
     * @param dades 
     */
    public void carregaPantalla(DadesJoc dades){
        // Buidem el congintut de la pantalla per carregar la pantalla del següent torn
        netejaPantalla();
        mostraRetol(titol, '*', 60);
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
        System.out.println();
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
        System.out.println(util.generaString('-', 65));
        System.out.println();
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
        System.out.println();
        System.out.println(util.generaString('=', 17));
        util.mostraTorn(dades);
        util.mostrarPunts(dades);
        util.mostraParaulesDescobertes(dades);
        System.out.println();
                
    }
    
    
    /**
     * Funció per mostrar el rètol del joc de paraules barrejades
     * @param linies array amb les linies del rètol a mostrar
     * @param caracter caracter amb el que es vol fer el marc del retol
     * @param amplada mida de l'ample del retol
     */
    public void mostraRetol(String[] linies, char caracter, int amplada){
        //Mostra una linea de caracters equivalent a l'amplada
        System.out.println(util.generaString(caracter, amplada));
        for (int i = 0;i<linies.length;i++){
            //Mostra dos caracters
            System.out.print(caracter + "" + caracter);
            //Calcula quants espais en blanc ha de posar
            int amountOfSpaces = ((amplada - linies[i].length())/2)-2;
            for (int i2 = 0;i2<amountOfSpaces;i2++) { System.out.print(" "); }
            //Posa el missatge corresponent
            System.out.print(linies[i]);
            //Calcula quant espai queda per posar caracters
            int spaceLeft = (amplada - (amountOfSpaces + linies[i].length() + 2));
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
