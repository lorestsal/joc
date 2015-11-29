package ioc.m3.uf2.eac6;
import ioc.m3.uf2.biblioteca.*;
import ioc.m3.uf2.eac6.interficie.*;
import ioc.m3.uf2.eac6.joc1.*;
import ioc.m3.uf2.eac6.joc2.*;


public class Menu {
    
    static String[] MENU_INCIAL = {"MENU INICIAL",
                                    "[1] Joc 1: Comença per",
                                    "[2] Joc 2: Paraules barrejades",
                                    "[6] Sortir"};
    
    public static void main(String[] args)
    {
        Menu prg = new Menu();
        prg.inici();        
    }
    
        public void inici()
        {
            Diccionari paraules = new Diccionari();
            System.out.println("======================================================================");
            System.out.println("  Benvinguts a 'Els Jocs del Diccionari'");
            Sortida menu = new Sortida(); 
            Entrada opcio = new Entrada();
            menu.mostrarMenu(MENU_INCIAL);
            int op=opcio.entrarEnter("Entra un enter: ");
            while (op!=6){
                switch(op)
                    {
                    case 1:
                        ExecucioJoc1 joc1 = new ExecucioJoc1();
                        joc1.joc1();
                    break;
                    case 2:
                        //Joc2();
                    break; 
                    case 6:
                        System.out.println("Fins la propera!");
                    break;
                    default:
                    {
                        System.out.println();                   
                        System.out.println("Només s'admeten tres opcions. Permeteu recordar-vos-les:");
                        System.out.println();
                        menu.mostrarMenu(MENU_INCIAL);
                        op = opcio.entrarEnter("Entra un enter: ");
                    };
                }
            // Un cop finalitzats els jocs, tornem a oferir escollir joc o sortir
            menu.mostrarMenu(MENU_INCIAL);
            op = opcio.entrarEnter("Entra un enter: ");    
            
            }
            
        }
        
}