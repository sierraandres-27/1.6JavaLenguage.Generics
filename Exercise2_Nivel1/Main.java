package Exercise2_Nivel1;

public class Main {

    public static void main(String[] args) {

        GenericMethods.getobjects(new Persona("Mario","Ortiz",33),"Buenos días", 5890);

        GenericMethods.getobjects("Buenos días", 5890,new Persona("Mario","Ortiz",33));

        GenericMethods.getobjects( 5890,"Buenos días",new Persona("Mario","Ortiz",33));

        

    }

}
