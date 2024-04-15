package hw1.javacore.part1.dog;

public class Dog {
    private String name;
    private int age;
    private String poroda;

    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    @Override
    public String toString() {
        return "Dog{name="+ name +", age="+ age +", poroda="+ poroda +"}";
    }
}
