package Exerciese1_Nivel1;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods<Integer> example =new NoGenericMethods<>(1,5,6);

        NoGenericMethods<String> example2 =new NoGenericMethods<>(4,6,5);

        NoGenericMethods<Double> example3 =new NoGenericMethods<>(6,4,5);


        System.out.println("The numbers are: "+example2.getFirst()+", "+example2.getSecond()+", "+example2.getThird());




    }
}
