/*
PRECEDENCIA
*/
public class Precedencia {
    public static void main(String[] args) {
        
        int n = 2;
        int m = n++ * 3 + 2 + (++n); // 2 * 3 + 2 + 4 = 12
        System.out.println("m = " + m);
        
        n = 2;
        int x = ++n + 2 + 3 * n++; // 3 + 2 + 3 * 3 = 14
        System.out.println("x = " + x);
        
        n = 2;
        int y = ++n + 2 + 3 * (n++ + 1); // 3 + 2 + 3 * 4 = 17
        System.out.println("y = " + y);
    }
}
