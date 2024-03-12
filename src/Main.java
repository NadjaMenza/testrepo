import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input = Hallo,
        // world
        //output = Hillo,world

        String first = sc.nextLine();
        String second = sc.nextLine();
        String all = second + first;
        String replace = all.replace('a', 'i');

        System.out.println(replace);
    }
}