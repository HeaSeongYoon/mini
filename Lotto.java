import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10) : ");
        int input = scanner.nextInt();

        if (input >= 1 && input <= 10) {
            Random random = new Random();


            int[][] userNumbers = new int[input][6];
            for (int j = 0; j < input; j++) {
                int[] numbers = new int[6];
                for (int i = 0; i < 6; i++) {
                    int num = random.nextInt(45) + 1;
                    while (contains(numbers, num)) {
                        num = random.nextInt(45) + 1;
                    }
                    numbers[i] = num;
                }
                userNumbers[j] = numbers;

                System.out.print((char)('A' + j) + "\t");
                for (int i = 0; i < 6; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            }
            System.out.println();


            int[] winningNumbers = new int[6];
            for (int i = 0; i < 6; i++) {
                int num = random.nextInt(45) + 1;
                while (contains(winningNumbers, num)) {
                    num = random.nextInt(45) + 1;
                }
                winningNumbers[i] = num;
            }


            System.out.println("[로또 발표]\n");
            System.out.print("\t");
            for (int i = 0; i < 6; i++) {
                System.out.print(winningNumbers[i] + " ");
            }
            System.out.println("\n");


            System.out.println("[내 로또 결과]\n");
            for (int j = 0; j < input; j++) {
                int[] numbers = userNumbers[j];
                System.out.print((char)('A' + j) + "\t");
                for (int i = 0; i < 6; i++) {
                    System.out.print(numbers[i] + " ");
                }
                int matchCount = countMatches(numbers, winningNumbers);
                System.out.println("=> " + matchCount + "개 일치");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }

    private static int countMatches(int[] array1, int[] array2) {
        int count = 0;
        for (int element1 : array1) {
            for (int element2 : array2) {
                if (element1 == element2) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}

