package functions;

public class Square {
    public static boolean isSquare(int n) {
        if(n >= 0){
            double sqrt = Math.sqrt(n);
            double decimal = sqrt - (int) sqrt;
            return !(decimal > 0);
        }
        return false;
    }
}
