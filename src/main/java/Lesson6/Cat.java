package Lesson6;

public class Cat {
    String name;
    int age;
    String type;
    String ownerSurname;

    public String toString() {
        return String.format("%s %d %s %s", name,age, type, ownerSurname);

    }


}
