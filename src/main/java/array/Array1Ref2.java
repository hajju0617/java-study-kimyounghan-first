package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;  // 배열 변수 선언
        students = new int[5];

        System.out.println(students);   // [I : int형 배열, @ 뒤에 16진수는 참조값을 뜻함.

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
//        students[5] = 40;   // ArrayIndexOutOfBoundsException 발생

//        students = new int[]{90, 80, 70, 60, 50}; // 5 ~ 15번행을 1줄로 줄이기 : 배열 생성과 초기화

        System.out.println("students.length = " + students.length);
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
