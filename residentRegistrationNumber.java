import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class residentRegistrationNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        residentRegistrationNumber main = new residentRegistrationNumber();
        HashMap<String, String> user = new HashMap<String, String>();


        Random random = new Random();

        System.out.print("출생년도를 입력해 주세요.(yyyy) : ");
        String year = sc.next();

        if(Integer.parseInt(year) > 2022) {
            System.out.println("아직 출생 전 입니다.");
            main.main(args);
            return;
        }

        System.out.print("출생월을 입력해 주세요.(mm) : ");
        String month = sc.next();

        if(Integer.parseInt(month) > 12) {
            System.out.println("없는 달 입니다. 다시 입력해 주세요.");
            main.main(args);
            return;
        }

        System.out.print("출생일을 입력해 주세요.(dd) : ");
        String day = sc.next();

        if(Integer.parseInt(day) > 31) {
            System.out.println("없는 날짜 입니다.");
            main.main(args);
            return;
        }

        System.out.print("성별을 입력해 주세요. (m/f) : ");
        user.put("gender", sc.next());

        user.put("year", year);
        user.put("month", month);
        user.put("day", day);

        main.getUserId (user);
    }

    // ID 앞자리
    public String frontId(HashMap user) {
        return user.get("year").toString().substring(2) + user.get("month") + user.get("day");
    }

    // Id 뒷자리
    public String lastId(HashMap user) {
        StringBuffer result = new StringBuffer();
        Random random = new Random();

        int yearInt = Integer.valueOf((String) user.get("year"));

        if (yearInt < 2000) {
            result.append( "m".equals(user.get("gender")) ? "1" : "2" );
        } else {
            result.append( "m".equals(user.get("gender")) ? "3" : "4" );
        }

        for(int i = 0 ; i < 6 ; i++) {
            result.append( random.nextInt(10) );
        }

        return result.toString();
    }

    public void getUserId (HashMap user) {
        System.out.println(frontId(user) + "-" + lastId(user));
    }

}