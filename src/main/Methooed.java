package main;

public class Methooed {

    String name;

    public Methooed (){
        name = "홍길tka";
    }

    public Methooed(String b){
        name =b;
    }

    public String getName(){
        return name;
    }

    public  void setName(String c){
        name = c;
    }
///////////////////////////////////////////////////
    public static void main(String[] args){
        Methooed a = new Methooed();
        Methooed b = new Methooed();
        String name = b.name;  // 나쁜 방법
        String name2 = a.getName();  //좋은방법

        System.out.println(name);
        System.out.println(name2);

        Methooed c = new Methooed();
        c.setName("김첨지");
        System.out.println(c.getName());

        String anane = c.getName();
        System.out.println(anane);



    }

}
