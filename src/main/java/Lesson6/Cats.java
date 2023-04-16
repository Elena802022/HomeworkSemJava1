package Lesson6;

public class Cats {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.age=5;
        cat1.name="Vlad";
        cat1.ownerSurname="Elena";
        cat1.type="siam";

        Cat cat2=new Cat();
        cat2.age=3;
        cat2.name="Mag";
        cat2.ownerSurname="Anna";
        cat2.type="russian";

        Cat cat3=new Cat();
        cat3.age=2;
        cat3.name="Bag";
        cat3.ownerSurname="Sim";
        cat3.type="british";
        System.out.println(cat2);
    }
}
