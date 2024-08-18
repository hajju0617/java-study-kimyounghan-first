package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최대값
        long maxIntOver = 2147483648L;  // int 최대값 + 1  (오버플로우)
        int intValue = 0;

        intValue = (int)maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}
