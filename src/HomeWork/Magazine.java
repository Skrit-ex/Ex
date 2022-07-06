package HomeWork;

import java.util.Objects;

public class Magazine implements PrintAble{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void magazinPrint(PrintAble[] printAbles){
            for(PrintAble printAble:printAbles){
                System.out.println(printAble);
            }
    }

    @Override
    public void print() {
        System.out.println("Printing magazin " + getName());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
