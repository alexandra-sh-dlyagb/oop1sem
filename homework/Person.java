package homework;

public class Person {
    private String name;
    private String surname;
    private int age;
    private SexType sex;

    public String getName(){
        return name;
    }

    public Person(String name, String surname, int  age, SexType sex){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

}
