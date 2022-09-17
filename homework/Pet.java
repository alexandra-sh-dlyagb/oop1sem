package homework;

public abstract class Pet {
    private String PetsName;
    public Pet(String PetsName){
        this.PetsName = PetsName;
    }
    public String GetPetsName(){
        return PetsName;
    }
    public String CallCat(){
        System.out.println("Кошечка, отзовись!");
        return "мяу";
    }
}
