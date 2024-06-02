package main;

public class array {

    public static void main(String [] args){

        Methooed a = new Methooed();  // 퍼블릭으로 다른 클래스의 메소드 가져오기
        System.out.println(a.getName());
////////////////////////////////////////////////////


        System.out.println("hello");


        int[] array = new int[]{0, 4, 7, 9, 8};

        System.out.println(array[2]);

    }
}
