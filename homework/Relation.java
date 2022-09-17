package homework;

import java.lang.reflect.Constructor;

public class Relation {
    Person person1;
    Person person2;
    RelationType relationType;

    public Relation(Person person1, Person person2, RelationType relationType){
        this.person1 = person1;
        this.person2 = person2;
        this.relationType = relationType;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Relation{" + "person1=" + person1.getName() + ", person2=" + person2.getName() + ", RelationType=" + relationType + "}";
    }
}
