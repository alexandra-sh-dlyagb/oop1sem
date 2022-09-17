package homework;

import java.util.ArrayList;

public class Research {
    ArrayList<Relation> allRelation = new ArrayList<>();

    public ArrayList<Person> findRelation(String name, RelationType type){
        ArrayList <Person> result = new ArrayList<>();
        for (Relation relation : allRelation){
            if (relation.person1.getName().equals(name) && relation.relationType == type){
                result.add(relation.person2);
            }
        }
        return result;
    }
 }
