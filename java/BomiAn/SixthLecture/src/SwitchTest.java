import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님! ");

        //boolean이란 참, 거짓을 표현할 수 있는 데이터타입입니다.
        Boolean isTrue = true;

        Scanner scan = new Scanner(System.in);
        int num;

        while (isTrue) {
            System.out.print("숫자를 눌러 물건을 담으세요 :");

            num = scan.nextInt();
            // 입력된 키보드 값에 따라 적절한 처리를 하게 된다.
            // 키보드 값에 따라 처리하는 루틴은 case x에 해당한다.
            // 0번이 눌렸다면 case 0, 1번이라면 case 1과 같은 형식이다.

            // switch에서 판정에 사용하는 것이 String이라면
            // case에서 사용하는것도 String으로 맞춰서 동작시킬 수 있다.
            switch (num) {
                case 0 :
                    System.out.println("탈출합니다.");
                    isTrue =false;
                    break;
                // break;
                // break는 더 이상 밑으로 내려가지 않고
                // 이 시점에서 종료할 수 있게 도와주는 역할을 한다.
                case 1 :
                    System.out.println("비누를 장바구니에 담았습니다.");
                    break;
                case 2 :
                    System.out.println("신발을 장바구니에 담았습니다.");
                    break;
                case 3 :
                    System.out.println("에어팟을 장바구니에 담았습니다.");
                    break;
                default :
                    // 이 default라는 녀석은 말 그대로 기본값에 해당함
                    // 우리가 예상치 못한 입력이 존재할 수 있음
                    // 이 경우에 활용하는것이 default라고 보면 됩니다.
                    System.out.println("해당 상품은 판매하지 않습니다.");
                    break;
            }
        }
    }
}
