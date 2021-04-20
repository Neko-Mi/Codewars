import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String handle = scanner.nextLine();
        char [] cstr = scanner.nextLine().toCharArray();
        int delta = scanner.nextInt();

        switch(handle){
            case "enc":
                encryption(cstr, delta);
                break;
            case "dec":
                decryption(cstr, delta);
                break;
            default:
                break;
        }
    }

    static void encryption(char[] cstr, int delta){
        for(int i = 0; i < cstr.length; i++){
            cstr[i] += delta;
            System.out.print(cstr[i]);
        }
    }

    static void decryption(char[] cstr, int delta){
        for(int i = 0; i < cstr.length; i++){
            cstr[i] -= delta;
            System.out.print(cstr[i]);
        }
    }
}