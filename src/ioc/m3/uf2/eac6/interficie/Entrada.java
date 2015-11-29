package ioc.m3.uf2.eac6.interficie;

import java.util.Scanner;

public class Entrada {
    
    /**
     * Funció que retorna un nombre enter introduit per l'usuari i que comprova
     * que el nombre introduit és un enter
     * 
     * @param missatge String de text explicatiu
     * @return enter nombre enter introduit per l'usuari
     */
    public int entrarEnter(String missatge){
        Scanner scanner = new Scanner(System.in);
        int enter = 0;
        boolean correcte;
        do{
             System.out.println();
             System.out.print(missatge);
             correcte=scanner.hasNextInt();
             if(correcte){
                 enter=scanner.nextInt();
                 scanner.nextLine();
             }else{
                 scanner.nextLine();
                 System.out.print("Cal que introduiu un valor enter");
             }
        }while(!correcte);   
        return enter;
    }
    
    /**
     * Funció per recollir la cadena de text introduida per l'usuari que valida que la 
     * cadena introduida no és una cadena buida
     * 
     * @param missatgeExplicatiu String de text explicatiu
     * @return ret String de text amb la cadena introduida per l'usuari
     */
    public String entrarText(String missatgeExplicatiu){
        Scanner scanner = new Scanner(System.in);
        String ret;
        do{
            System.out.print(missatgeExplicatiu);        
            ret = scanner.nextLine();
            if(ret.length()==0){
                System.out.println("Una cadena buida no és un entrada vàlida. Escriviu un text, si us plau.");
            }
        }while(ret.length()==0);
        return ret; 
    }
}

