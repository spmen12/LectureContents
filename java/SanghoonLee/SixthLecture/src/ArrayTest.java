public class ArrayTest {
    public static void main(String[] args) {
        // 배열은 왜 써야 할까 ?
        // 동일한 데이터 타입의 변수가 여러개 필요할때
        // 일일히 int a, b, c, d, e, f, g, h, i ... z 까지 해봐야 26개 밖에 안됨
        // 만약 회사에서 직원 1000명을 관리해야 한다 가정한다면
        // 이것을 일일히 변수로 선언한다면 죽을 것이다.
        // 당연히 배열을 만들어서 관리해야할 것이다.
        int arr[] = { 1, 2, 3, 4, 5 };
        // int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        // 데이터가 많으면 많을수록 단일 변수 선언은 지옥을 체험하게 해줄 것이다.
        // 그러니 우리는 심신의 안정을 위해 배열을 사용해야할 것이다.

        // 배열을 만드는 방법
        // 1. stack에 할당하는 방법(지역 변수)
        //    1-1. 일단은 배열의 데이터 타입(int 같은)을 적는다.
        //    1-2. 배열의 이름이 될 변수명을 적는다.
        //    1-3. 배열임을 알리기 위해 []을 변수 옆에 적어준다.
        //    1-4. 필요하다면 배열의 값들을 초기화한다.
        //         (이때 원소로 지정한 숫자에 따라 배열의 길이가 지정된다)
        //    * 가변으로 구성하고 싶다면 new를 사용해야 하는데 이것은 다음주에 학습하도록 한다.

        // 아래와 같은 데이터를 살펴보자
        // int arr[] = { 1, 2, 3, 4, 5 };
        // 위 데이터는 아래와 같은 형식으로 저장된다.

        //     ---------------------
        // arr | 1 | 2 | 3 | 4 | 5 |
        //     ---------------------
        //      [0] [1] [2] [3] [4]
        // 배열의 인덱스(방) 번호는 0번부터 시작함에 주의하도록 한다.
        // 그러나 방 번호가 순차적으로 증가하기 때문에
        // for 문이나 while 문등의 반복문과의 혼합구성에 있어 매우 탁월하다.

        for (int i = 0; i < 5; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
