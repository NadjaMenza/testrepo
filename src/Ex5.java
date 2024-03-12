import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        int interest = sc.nextInt();
        int money = sc.nextInt();

        int t = 0;
        int a = money;
        while (a <= money*2){
            //a = (a+a*interest)/10;
            a = a + a*interest/100;
            t++;
        }
        System.out.println(t);

    }
}
