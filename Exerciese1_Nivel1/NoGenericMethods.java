package Exerciese1_Nivel1;


public class NoGenericMethods<T> {

    private T first;
    private T second;
    private T third;

    public NoGenericMethods(T fisrt, T second, T third){

        this.first=fisrt;

        this.second=second;

        this.third=third;

    }

    public void setFirst (T first){

        this.first=first;
    }

    public void setSecond (T second){

        this.second=second;
    }

    public void setThird(T third){

        this.third=third;
    }

    public T getFirst (){

        return first;
    }

    public T getSecond (){

        return second;
    }

    public T getThird (){

        return third;
    }
}
