
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("введите кол-во элементов в массиве");
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("введены некорректные данные");
            System.exit(1);
        }
        float[] a = new float[n];
        if (n >= 2) {
            try {
                System.out.println("введите все элементы массива");
                for (int i = 0; i < n; i++) {
                    a[i] = in.nextFloat();
                }
            } catch (InputMismatchException e) {
                System.out.println("введены некорректные данные");
                System.exit(1);
            }
            int k = 0;
            try {
                System.out.println("введите индекс элемента K,");
                k = in.nextInt();
                in.close();
            } catch (InputMismatchException e) {
                System.out.println("введены некорректные данные");
                System.exit(1);
            }
            if ((k >= 1) & (k <= n - 1)) {
                float sum = 0;
                float ArithmeticMean = 0;
                for (int i = 0; i < k; i++) {
                    sum = sum + a[i];
                }
                ArithmeticMean = sum / k;
                float[] Anew = new float[n];
                for (int i = 0; i < n; i++) {
                    Anew[i] = a[i];
                }
                Anew[k] = ArithmeticMean;
                System.out.println("массив:");
                for (float elem : a) {
                    System.out.print(elem + " ");
                }
                System.out.println("\nмассив после сглаживания:");
                for (float elem : Anew) {
                    System.out.print(elem + " ");
                }
            } else {
                System.out.println("индекс K должен находиться в диапазоне от первого элемента массива до последнего включая,");
            }
        } else {
            System.out.println("кол-во эллементов массива должно быть больше двух");
        }
    }
}