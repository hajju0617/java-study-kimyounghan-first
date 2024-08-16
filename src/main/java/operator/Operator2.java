package operator;

public class Operator2 {
    public static void main(String[] args) {
        String resutl1 = "hello" + "hello";
        System.out.println(resutl1);

        String s1 = "String1";
        String s2 = "String2";

        String result2 = s1 + s2;
        System.out.println(result2);

        String result3 = "a + b = " + 10;   //  "문자" + 숫자 => "문자" + "문자" (숫자를 문자로 바꿔버림)
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = "a + b = " + num;
        System.out.println(result4);



    }
}
