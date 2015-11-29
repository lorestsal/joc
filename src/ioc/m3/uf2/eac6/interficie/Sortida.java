package ioc.m3.uf2.eac6.interficie;

public class Sortida {
    
       public void mostrarMenu(String[] menu) {
        
        int titolMenu = 0;
        
        System.out.println("=============================================");
        System.out.println(menu[titolMenu]);
        System.out.println("=============================================");
        for (int i=1; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
    }
    
}
