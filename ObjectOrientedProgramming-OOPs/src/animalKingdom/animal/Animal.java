package animalKingdom.animal;

public class Animal {

    public int age;
    public String gender;
    public int weight;
    public String name;

    public Animal(String name, int age, String gender, int weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }   

    public void eat(){
        System.out.println(name+" is eating...");
    }

    public void sleep(){
        System.out.println(name+" is sleeping...");
    }
}
