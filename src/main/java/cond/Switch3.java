package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:             // 이렇게 할 경우 case 2: 에 대한 break;문이 없어서
            case 3:             // 중단 하지 않고 바로 다음에 있는 case 3코드를 실행 함.
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰 " + coupon);
    }
}
