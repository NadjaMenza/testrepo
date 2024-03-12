import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNr = rand.nextInt(10)+20;

        int [] number = new int[randNr];
        int sum=0;
        int mean = 0;

        for (int i=0; i<number.length;i++){
            number[i] = rand.nextInt(1000)+1000;
            sum+=number[i];
            //System.out.println(number[i]);
        }
        mean = sum/number.length;
        System.out.println(sum);
        System.out.println(mean);

    }
}
