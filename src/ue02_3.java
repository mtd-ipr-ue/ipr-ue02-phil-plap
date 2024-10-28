import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        int radius = 4;

        System.out.print("Geben Sie die x-Koordinate ein: ");
        double x = In.readDouble();
        System.out.print("Geben Sie die y-Koordinate ein: ");
        double y = In.readDouble();

        if (x > 0 && y > 0 && Math.sqrt(x*x + y*y) > radius  && Math.sqrt(x*x + y*y)<Math.sqrt(radius*radius+radius*radius)) {
            Out.println("innerhalb der grünen Fläche");
        }else {
            Out.println("ausserhalb der grünen fläche");
        }
    }
}

// zusatz aufgabe: lösen der boolean vergleiche in einer zeile, und dem prof auch erklärt