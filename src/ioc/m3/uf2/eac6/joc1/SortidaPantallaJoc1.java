package ioc.m3.uf2.eac6.joc1;
import ioc.m3.uf2.biblioteca.*;
import java.util.Scanner;

public class SortidaPantallaJoc1 {
    Utilitats util = new Utilitats();
    Scanner scanner = new Scanner(System.in);
    String[] titol = {"COMENÇA PER"};
    
    /**
     * Funció que finalitza la partida en cas d'encertar la paraula
     * @param bossaDePunts número de punts que disposa l'usuari
     * @param proposta proposta introduida per l'usuari
     * @param paraula paraula a endevinar
     */
    public void finalPartida(int bossaDePunts, String proposta, String paraula){
        if (proposta.equals(paraula)){
            System.out.println("Molt bé! Has endevinat la paraula i has conservat "+bossaDePunts+" punts!");    
        } else{
            System.out.println("Has esgotat tots els punts. La paraula amagada era: "+paraula);    
        }
            System.out.println("Prem [ENTRAR] per continuar.");
            String aux = scanner.nextLine();
    }
    
        /**
     * Funció que avalua si l'usuari pot demanar una pista si és que pot demanar més pistes
     * @param bossaDePunts punts que li queden a l'usuari
     * @param esPotDonarPista booleà que determina si l'usuari pot o no demanar més pistes
     * @return booleà que determina si pot o no demanar pista
     */
    public boolean potDemanarNovaPista(int bossaDePunts, boolean esPotDonarPista, int pistesConcedides, String paraula){
        boolean ret=false;
        if (esPotDonarPista){
            System.out.println("L'intent ha estat fallit. Si vols podem descobrir-te una nova lletra amb la");
            System.out.println("que comença, però recorda que per cada lletra visible et treurem un punt ");
            System.out.println("extra de la bossa.");
            System.out.println();
            System.out.print("Et queden "+bossaDePunts+" punts. Vols obtenir una nova lletra (S/N)?: ");
            String aux = scanner.nextLine();
            switch (aux) {
                case "S":
                case "s":
                    ret = true;
                    break;
                case "N":
                case "n":
                    ret = false;
                    break;
                default:
                    System.out.print("No has introduit una opció vàlida. No es proporciona una pista més. ");
            }
        } else {
            if(pistesConcedides==paraula.length()-1){
                System.out.println("L'intent ha estat fallit. Et queden "+bossaDePunts+" punts. No queden més pistes per donar.");
                
            } else{
                System.out.println("L'intent ha estat fallit. Et queden "+bossaDePunts+" punts. No son suficients per demanar més pistes.");
            }
            System.out.println("Prem [ENTRAR] per continuar.");
            String entrar = scanner.nextLine();
        }
        System.out.println();
        System.out.println();
        return ret;
    }
    
     /**
     * Funció que retorna un boleà per determinar si es pot donar una nova pista o no
     * @param paraulaAEndevinar paraula que l'usuari ha d'endevinar
     * @param pistesDonades número de pistes donades a l'usuari
     * @param bossaDePunts punts que acumula l'usuari
     * @return booleà que indica si es pot donar nova pista
     */
    public boolean esPotDonarNovaPista(String paraulaAEndevinar,int pistesDonades,int bossaDePunts){
        boolean ret;
        ret = pistesDonades<paraulaAEndevinar.length()-1;
        ret = ret && bossaDePunts>2;
        return ret;
    }


    /**
     * Funció que carrega les dades de la partida per pantalla i demana proposta de paraula a l'usuari
     * @param bossaDePunts punts que li queden a l'usuari
     * @param pista String de la pista donada a l'usuari per endevinar la paraula
     * @param paraula paraula a endevinar per l'usuari
     * @return paraula introduida per l'usuari per endevinar la paraula amagada
     */
    public String carregaPantalla(int bossaDePunts, String pista, String paraula){
        mostraRetol(titol, '*', 60);
        mostraInstruccions(bossaDePunts, pista);
        String proposta = demanaParaula(bossaDePunts, pista, paraula);
        return proposta;
    }
    
    /**
     * Funció que demana una Paraula a l'usuari i retorna la paraula introduida per teclat
     * @param bossaDePunts punts que li queden a l'usuari
     * @param pista string amb la pista introduida a l'usuari
     * @param paraula és la paraula a endevinar per l'usuari
     * @return la paraula introduida per l'usuari per teclat
     */
    public String demanaParaula(int bossaDePunts, String pista, String paraula){ 
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.print("Intenta endevinar la paraula: ");
            String proposta = scanner.nextLine();
            System.out.println();
            return proposta;
    }

    /**
     * Funció que mostra les instruccions del joc
     * @param bossaDePunts punts que li queden a l'usuari
     * @param pista String amb la pista donada a l'usuari
     */
    public void mostraInstruccions(int bossaDePunts,String pista){
        System.out.println("Disposes d'una bossa inicial de 15 punts per aconseguir endevniar la paraula. Anims!");
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
}

