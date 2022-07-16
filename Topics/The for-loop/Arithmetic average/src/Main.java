import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sumT = 0;
        int countT = 0;
        double result = 0;
        for (int i = a; i <= b; i++) {

            if (i % 3 == 0) {
                sumT += i;
                countT++;
            }

        }

        if (countT != 0) {
            result = (double) sumT / countT;
        }

        System.out.println(result);
    }
}