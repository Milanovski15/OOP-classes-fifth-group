package oopprinciples.animal;

public abstract class Animal {

    int age;
    String color, name, type;

    public Animal(int age, String color, String name, String type){
        this.age = age;
        this.color = color;
        this.name = name;
        this.type = type;
    }

    public Animal(){

    }

    public void setAge(int age){
        if(age > 110){
            throw new IllegalArgumentException("The age value must not be higher than 110");
        }
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setName(String name){
        if(name.length() > 25){
            throw new IllegalArgumentException("The name of the animal must not be bigger than 25 characters");
        }
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String eat(){
        return "The animal is eating";
    }

}
