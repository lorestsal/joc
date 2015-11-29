package ioc.m3.uf2.eac6.interficie;

import java.util.Scanner;

public class Entrada {
    
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
    
    public String entrarText(String msg){
        Scanner lector = new Scanner(System.in);
        String txt="";
        while (txt.length()==0) { 
            System.out.println(msg);
            txt=lector.nextLine();
        }
        return txt; 
    }
}

