package main;

public class Class0602 {

    public static void main(String[] args){

        //1부터 10의 합

        int a = 0;

        for(int i = 0; i <=10; i++){
            System.out.println(i);
            a+=i;
        }

        System.out.println(a);

       ///////////////////

        for(int r = 1;r<=9;r++){
            for(int y = 1; y<=9; y++){
                if ( y == 1){
                    System.out.println();
                    System.out.println("이것은"+r+"단");
                }

                System.out.println(r+" * "+y+" = "+r*y);
            }
        }


    }

}
