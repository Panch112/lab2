public class Main {
    public static void main(String[] args) {
        System.out.println("׸���� ����� �� 1 �� 100:");
        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            if (currentNumber % 2 == 0) {
                System.out.print(currentNumber + " ");
            }
        }

        System.out.println("\n\n�������� ����� �� 1 �� 100:");
        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            if (currentNumber % 2 != 0) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}