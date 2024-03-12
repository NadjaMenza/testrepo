import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int t = 0;

        while (input<=100){
            input*=input;
            t++;
        }
        System.out.println(input);
        System.out.println(t);
    }
}
