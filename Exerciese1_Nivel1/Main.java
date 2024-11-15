package Exerciese1_Nivel1;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods<Integer> example =new NoGenericMethods<>(4,5,6);

        NoGenericMethods<Integer> example2 =new NoGenericMethods<>(4,6,5);

        NoGenericMethods<Integer> example3 =new NoGenericMethods<>(6,4,5);


        example.setFirst(1);

        example.setSecond(2);

        example.setThird(3);

        System.out.println("The numbers are: "+example.getFirst()+", "+example.getSecond()+", "+example.getThird());




    }
}
