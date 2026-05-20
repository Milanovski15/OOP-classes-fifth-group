package oopprinciples.animal;

public class Bird extends Animal{

    String beakType;

    public Bird(int age, String color, String name, String type, String beakType){
        super(age, color, name, type);
        this.beakType = beakType;
    }

    public Bird(){

    }

    public void setBeakType(String beakType){
        this.beakType = beakType;
    }

    public String getBeakType(){
        return beakType;
    }

    @Override
    public String eat(){
        return "The bird " + name + " is eating";
    }

}
