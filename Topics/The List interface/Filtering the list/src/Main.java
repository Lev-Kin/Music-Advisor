import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        for (int i = str.length - 1; i >= 0; i--) {

            if (i % 2 != 0) {
                System.out.print(str[i] + " ");
            }

        }
    }
}