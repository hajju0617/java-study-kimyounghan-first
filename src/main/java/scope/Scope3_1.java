package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0) {
           temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

        /*
        여기서 2배 증가한 값을 저장해두기 위해 임시 변수 temp를 사용.
        하지만 이 코드는 좋은 코드가 아니다.
        temp는 if 조건이 만족할 때만 잠깐 사용하는 변수인데 전역 변수처리가 되어 있음.

        1. 비효율적인 메모리 사용
        - temp는 if 코드 블록에서만 필요하지만 main() 코드블록이 종료될 때까지 메모리에 유지 됨.
        따라서 불필요한 메모리가 낭비 됨.

        2. 코드 복잡성 증가.
        if 코드 블록이 끝나고 main() 어디서나 temp에 접근 할 수 있음.
        나 아닌 누군가가 해당 코드를 유지보수할 때 m, temp 둘 다 신경 써야 한다.
        scope가 불필요하게 넓다.
         */
    }
}
