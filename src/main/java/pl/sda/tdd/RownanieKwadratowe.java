package pl.sda.tdd;

public class RownanieKwadratowe {
    public static String oblicz(int a, int b, int c) {
        double delta = b^2 - 4*a*c;
        double x0, x1, x2, pierwDelta = Math.sqrt(delta);
        if (delta == 0) {
            x0 = ((-b) / (2*a));
            return "" + (int)x0;
        } else if (delta > 0) {
            //coś tu nie działa... :(
            x1 = (-b - pierwDelta) / (4*a);
            x2 = (-b + pierwDelta) / (4*a);
            return (int)x1 + "," + (int)x2;
        }
        else return "";
    }
}
