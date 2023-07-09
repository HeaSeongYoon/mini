import java.util.Scanner;


public class cashBack {
    // <결제 금액 캐시백 계산 프로그램> 과제2 (배점 5)
    /*  * 필수 준수사항
            1. 주어진 캐시백 적립 조건에 맞게 캐시백 계산 
            2. 결제 금액을 입력하면, 이에 대한 캐시백 계산 후 결과 출력*/


    public static void main(String[] args) {

        int cashBack = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액) : ");
        num=sc.nextInt();

        cashBack =(int) Math.floor(num/1000.0)*100;

        if(num>=1000){
            if(cashBack > 300){
                cashBack = 300;
            }
            System.out.println("결제 금액은 "+num+"원이고, 캐시백은 "+cashBack+" 원 입니다.");
        }else{
            System.out.println("캐쉬백을 쌓으실 수 없습니다.");
        }

    }

}