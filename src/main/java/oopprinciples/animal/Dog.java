package oopprinciples.animal;

public class Dog extends Animal{

    boolean isTrained;
    boolean newVar;
    boolean newVar1;

    public Dog(int age, String color, String name, String type, boolean isTrained){
        super(age, color, name, type);
        this.isTrained = isTrained;
    }

    public Dog(){

    }

    public void setIsTrained(boolean isTrained){
        this.isTrained = isTrained;
    }

    public boolean getIsTrained(){
        return isTrained;
    }

    @Override
    public String eat(){
        return "The dog " + name + " is eating";
    }
}
