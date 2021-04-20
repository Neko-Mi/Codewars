package functions;

public class Kata {
    public static int findSquares(int x, int y){
        int squares = x * y;

        if (x != y){
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            while(min > 1){
                max -= 1;
                min -= 1;
                squares += max * min;
            }

        } else {
            while(x > 1){
                x -= 1;
                y -= 1;
                squares += x * y;
            }
        }

        return squares;
    }
}