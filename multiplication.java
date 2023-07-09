public class multiplication {
    // <콘솔 화면에 구구단 출력하기> 과제 1 (배점 5)
    /*  * 필수 준수사항
            1.다중 반복문을 이용하여 코딩
            2.   콘솔화면에 내용이 맞도록 format함수 이용하여 코딩
            3. 제목 및 1단부터 9단까지 표시(예시와 동일한 레이아웃으로 작성)*/


    /*  * 권장사항
            1. String.format 함수를 학습해 보세요.
            2. 반복문에 대한 초기값은 주어진 조건에 맞게 작성해 보세요.
            3. 코드 작성시, 복잡하게 작성하기 보다는 최대한 필요한 코드를 통한 심플하게 작성해 주세요.*/

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + String.format("%2d", i * j));
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}