public class Main {
    public static void main(String[] args) {
        System.out.println("׸���� ����� �� 1 �� 100:");
        printEvenNumbers();

        System.out.println("\n\n�������� ����� �� 1 �� 100:");
        printOddNumbers();
    }

    private static void printEvenNumbers() {
        for (int number = 2; number <= 100; number += 2) {
            System.out.print(number + " ");
        }
    }

    private static void printOddNumbers() {
        for (int number = 1; number <= 99; number += 2) {
            System.out.print(number + " ");
        }
    }
}