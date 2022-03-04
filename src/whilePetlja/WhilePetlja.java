package whilePetlja;
import java.util.Scanner;
public class WhilePetlja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite rec:");
        String rec = s.nextLine();
        boolean stop = false;
        
        while(!stop){
            if(rec.equalsIgnoreCase("stop")){
                System.out.println("uneta je rec: " + rec);
                stop = true;
            }else{
                System.out.println("Unesite rec:");
                rec = s.nextLine();
                System.out.println("Uneta je rec:" + rec);
            
            }   
        }
    }
}
