import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Choose. Your. NUMBERS!!!");
        int nummer1 = In.readInt();
        int nummer2 = In.readInt();
        int nummer3 = In.readInt();

        if (nummer1 > nummer2 && nummer1 > nummer3){
            Out.println(nummer1);
        } else if ( nummer2 > nummer1 && nummer2 > nummer3) {
            System.out.println(nummer2);
        } else if (nummer3 > nummer1 && nummer3 > nummer2) {
            System.out.println(nummer3);
        }
        
    }
}
