package Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
public class Laptop {
    String name;
    int id;
    String number;
    String processor;
    String videoCard;
    String display;
    int price;


    @Override
    public int hashCode() {
        return Objects.hash(name, id, number, processor, videoCard, display, price);
    }

    public String toString() {
        return String.format("%s, %d, %s, %s, %s, %s, %d", name, id, number, processor, videoCard, display, price);

    }

    public boolean equals(Object o) {
        var t = (Laptop) o;
        return id == t.id && number == t.number;
    }

     public String getName(){
        return name;
     }

    public String getNumber(){
        return number;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    
}
