package main;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>(); // 배열의 길이를 알지 못할때 사용
        int a;

        //값은 add로 넣으면 되기에 매우 편함
        arraylist.add(0);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(99);
        arraylist.add(5);
        arraylist.add(88);

        System.out.println(arraylist.size());

        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(4));
        System.out.println(arraylist.get(arraylist.size()-1));
        System.out.println("------------------------아래는 for문");

        for(int i = 0; i <arraylist.size(); i++){
            System.out.println(i);
            System.out.println(arraylist.get(i));
        }

    }

}
