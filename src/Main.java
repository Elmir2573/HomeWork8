import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 8");
        System.out.println("Задание 1");
        int[] numbers1 = new int[]{1, 2, 3, 1, 2, 3};
        float[] numbers3 = new float[]{1.57f, 7.654f, 9.986f};
        int[] integers1 = new int[]{1, 5, 8, 12, 18, 32};
        System.out.println();
        System.out.println("Задание 2");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print((numbers)[i] + ", ");
        }
        System.out.println();
        float[] numbers2 = new float[]{1.57f, 7.654f, 9.986f};
        for (int b = 0; b < numbers2.length; b++) {
            if (b == numbers2.length - 1) {
                System.out.println(numbers2[b]);
                break;
            }
            System.out.print((numbers2)[b] + ", ");
        }
        System.out.println();
        int[] integers = new int[]{1, 5, 8, 12, 18, 32};
        for (int i = 0; i < integers.length; i++) {
            if (i == integers.length - 1) {
                System.out.println(integers[i]);
                break;
            }
            System.out.print((integers)[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int[] numbers4 = new int[]{1, 2, 3};
        for (int a = numbers4.length - 1; a >= 0; a--) {
            System.out.print(numbers4[a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] numbers5 = new float[]{1.57f, 7.654f, 9.986f};
        for (int k = numbers5.length - 1; k >= 0; k--) {
            System.out.print(numbers5[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] integers4 = new int[]{1, 5, 8, 12, 18, 32};
        for (int g = integers4.length - 1; g >= 0; g--) {
            System.out.print(integers4[g]);
            if (g > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");

        for (int i = 0; i < integers.length; i++) {
            if (numbers1[i] % 2 != 0) {
                numbers1[i] = numbers1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(numbers1));
    }
}