package main;

public class study {

    public static void main(String[] args){


        int a= 1;
        int b = 2;
        double c = 1.8;

        String y= "";

        if(a == (int) c){
            y= "true";
        }else {
            y = "hi";
        }

        System.out.println(y);

        int aa = 10;
        int bb = 3;

        int cc = aa%bb;

        System.out.println(cc);

        System.out.println("-----------------");



        for(int i = 0; i<=5; i++){
            System.out.println(i);
            i++;
            System.out.println(i);
        }
        System.out.println("-----------------");

        for(int i = 0; i<=5; ++i){
            System.out.println(i);
            ++i;
            System.out.println(i);
        }
    }
}
