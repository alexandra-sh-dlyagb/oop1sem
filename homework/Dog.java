package homework;

public class Dog extends Pet{
    public Dog(String PetsName){
        super (PetsName);
    }
    public String CallGog(){
        System.out.println("Собачка, отзовись!");
        return "гав";
    }
}
