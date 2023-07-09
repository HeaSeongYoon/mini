import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        System.out.print("[과세금액 계산 프로그램]\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("연소득을 입력해 주세요. : ");
        long income = scanner.nextLong();
        scanner.close();

        long[] brackets = { 12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000 };
        double[] rates = { 0.06, 0.15, 0.24, 0.35, 0.38, 0.4, 0.42, 0.45 };


        long totalTax = 0;
        for (int i = 0; i < brackets.length; i++) {
            long bracketAmount = Math.min(brackets[i], income);
            long bracketTax = (long) (bracketAmount * rates[i]);
            System.out.printf("%3s %d * %2d%% = %,d\n", "", bracketAmount, (int) (rates[i] * 100), bracketTax);
            totalTax += bracketTax;
            income -= bracketAmount;
            if (income <= 0) {
                break;
            }
        }

        System.out.println("\n[세율에 의한 세금] : " + totalTax);
        System.out.println("[누진공제 계산에 의한 세금] : " + totalTax);

    }

}



