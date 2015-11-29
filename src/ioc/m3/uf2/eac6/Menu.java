package ioc.m3.uf2.eac6;
import ioc.m3.uf2.eac6.interficie.*;


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
            System.out.println("======================================================================");
            System.out.println("  Benvinguts a 'Els Jocs del Diccionari'");
            Sortida menu = new Sortida(); 
            Entrada opcio = new Entrada();
            menu.mostrarMenu(MENU_INCIAL);
            int op=opcio.entrarEnter("Entra un enter");
            switch(op)
            {
                case 1:
                    //Joc1();
                break;
                case 2:
                    //Joc2();
                break;                    
                default:
                {
                    System.out.println();                   
                    System.out.println("Només s'admeten dues opcions. Permeteu recordar-vos-les:");
                    System.out.println();
                    System.out.println("======================================================================");
                    //presentacio();
                };
            }
            
        }
   
}