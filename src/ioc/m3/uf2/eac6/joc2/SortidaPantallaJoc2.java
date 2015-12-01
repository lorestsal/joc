package ioc.m3.uf2.eac6.joc2;
import ioc.m3.uf2.biblioteca.GestorDadesJoc;
import ioc.m3.uf2.biblioteca.*;
import java.util.Scanner;

public class SortidaPantallaJoc2 {
    Utilitats util = new Utilitats();
    /*GestorDadesJoc gestor = new GestorDadesJoc();*/
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
        int nombreParaules = 0;
        String aux;// = new String();
        String[] paraules = new String[nombreParaules];
        Scanner scanner = new Scanner(System.in);
        aux=scanner.nextLine();
        dades.paraulesProposades=util.extreureParaulesString(aux);
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
    
    public void propostaInvalida(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ohhh! Has introduit paraules que no es poden formar amb les lletres del diposit.");
        System.out.print("Prem [ENTRAR] per continuar");
        String entrar = scanner.nextLine();
    }
    
    public void propostaNula(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ohhh! Les paraules introduides no son al diccionari.");
        System.out.print("Prem [ENTRAR] per continuar");
        String entrar = scanner.nextLine();
    }
    
    public void paraulesValides(String[] paraules){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Molt bé! Has format les següents paraules vàlides: ");
        for(int i=0; i<paraules.length; i++){
            System.out.print(paraules[i]+" ");
        }        
        System.out.println();
        System.out.print("Prem [ENTRAR] per continuar");
        String entrar = scanner.nextLine();
    }
    
}
