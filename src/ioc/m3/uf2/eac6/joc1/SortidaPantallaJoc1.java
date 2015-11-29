package ioc.m3.uf2.eac6.joc1;
import ioc.m3.uf2.biblioteca.*;
import java.util.Scanner;

public class SortidaPantallaJoc1 {
    Utilitats util = new Utilitats();
    //ExecucioJoc1 joc1 = new ExecucioJoc1();
    String[] titol = {"COMENÇA PER"};
    

    public void carregaPantalla(int bossaDePunts, String pista, String paraula){
        // Buidem el congintut de la pantalla per carregar la pantalla del següent torn
        netejaPantalla();
        mostraRetol(titol, '*', 60);
        mostraInstruccions(bossaDePunts, pista);
        demanaParaula(bossaDePunts, pista, paraula);
        
    }
    
    public String demanaParaula(int bossaDePunts, String pista, String paraula){
        if (pista.length()==paraula.length()){
            System.out.println("No queden pistes per mostrar. Joc finalitzat");
            return "";
        } else if (bossaDePunts == 0){
            System.out.println("No et queden punts per aconseguir pistes. Joc finalitzat.");
            return "";
        } else {  
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Intenta endevinar la paraula: "+pista);
        String proposta = scanner.nextLine();
        return proposta;
        }
    }

    
    public void mostraInstruccions(int bossaDePunts,String pista){
        System.out.println("Disposes d'una bossa de "+bossaDePunts+" punts per aconseguir endevniar la paraula. Anims");
        System.out.println();
        System.out.println("La paraula comença per: "+pista);
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
    private void netejaPantalla() {
        //Brut però visualment funciona perfectament.
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
    }
}

