package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;    // 값을 먼저 증가 시키고 대입.
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        b = a++;    // 먼저 대입하고 값을 증가.
        System.out.println("a = " + a + ", b = " + b);


        // ++a, a++ 과 같이 증감연산자를 단독으로 사용하는 경우에는
        // 다른 연산이 없기 때문에 본인의 값만 증가함
        // -> 전위, 후위 둘 다 결과가 같음.

        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

    }
}
