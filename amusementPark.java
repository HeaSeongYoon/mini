import java.util.Scanner;




public class amusementPark {

    //<놀이동산 입장권 계산 프로그램> 과제 3 (배점 10)


    public static void main(String[] args) {

        int age;
        int time;
        String manOfNationalMerit;
        String Card;
        int pay = 0;


        boolean run = true;
        while(run){

            Scanner sc = new Scanner(System.in);
            System.out.println("[입장권 계산]");
            System.out.print("나이를 입력해 주세요.(숫자) : ");
            age = sc.nextInt();
            System.out.print("입장시간을 입력해 주세요. (숫자입력) : ");
            time =sc.nextInt();
            System.out.print("국가유공자여부를 입력해 주세요. (y/n) :");
            manOfNationalMerit = sc.next().toLowerCase();
            System.out.print("복지카드 여부를 입력해 주세요. (y/n) : ");
            Card = sc.next().toLowerCase();

            // 시간 X
            if(time < 10 || time > 22){
                System.out.println("시간을 잘못 입력하셨습니다.");

                // 국가유공자 X y/n
            }else if(!("y".equals(manOfNationalMerit)|| "n".equals(manOfNationalMerit))){
                System.out.println("국가 유공자 여부를 잘못 입력하셨습니다.");

                // 복지카드 X y/n
            }else if(!("y".equals(Card) || "n".equals(Card))){
                System.out.println("복지카드 여부를 잘못 입력하셨습니다.");

            }else {
                if(age <= 3){
                }else if( "y".equals(manOfNationalMerit)|| "y".equals(Card) ){
                    pay = 8000;
                }else if(age < 13){
                    pay = 4000;
                }else if(time > 17){
                    pay = 4000;
                }else{
                    pay = 10000;
                }
                System.out.println("입장료 : "+ pay);
                System.out.println();
            }
            break;
        }

    }

}
