package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            if(i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("마지막 i의 값은 i  = " + i);
    }
}
