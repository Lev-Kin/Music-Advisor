import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        int multiplication = 1;
        for (int i = a; i < b; i++) {
            multiplication *= i;
        }

        System.out.println(multiplication);
    }
}