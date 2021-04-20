package functions;

public class Vowels {
    public int getCount(String str) {
        int vowelsCount = 0;
        char [] array = str.replace(" ", "").toCharArray();
        for (char ch:
             array) {
            switch (ch){
                case 'a':
                    vowelsCount++;
                    break;
                case 'e':
                    vowelsCount++;
                    break;
                case 'i':
                    vowelsCount++;
                    break;
                case 'o':
                    vowelsCount++;
                    break;
                case 'u':
                    vowelsCount++;
                    break;
                default:
                    break;
            }
        }

        return vowelsCount;
    }
}
