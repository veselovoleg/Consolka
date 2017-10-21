import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        boolean [][] dots = new boolean [5][5];

        Random randomBoolean = new Random();

            //Создадим таблицу случайных булевых значений при помощи циклов.

            for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 5; j++) {
                    dots[i][j] = randomBoolean.nextBoolean();
                    System.out.print(dots[i][j] + "\t");
                }
                System.out.println();
            }


    }
}
