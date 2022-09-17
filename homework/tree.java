package homework;

public class tree {
    public static void main(String[] args) {
        Person theOldestMan = new Person("Иван", "Паровозов", 72, SexType.MAN);
        Person theOldestWoman = new Person("Олимпия", "Паровозова", 70, SexType.WOMAN);
        Person theMiddleMan = new Person("Аркадий", "Паровозов", 46, SexType.MAN);
        Person theMiddleWoman = new Person("Евгения", "Паровозова", 49, SexType.WOMAN);
        Person theMiddleMansWife = new Person("Елизавета", "Добролюбова", 44, SexType.WOMAN);
        Person theYoungest = new Person("Ольга", "Паровозова", 20, SexType.WOMAN);
        Person thePet1 = new Person ("Абрикосина", "Паровозова", 1, SexType.WOMAN);
        Person thePet2 = new Person("Жучка", "Паровозова", 5, SexType.WOMAN);

        Relation relation1 = new Relation(theOldestMan, theOldestWoman, RelationType.HUSBAND);
        Relation relation2 = new Relation(theOldestWoman, theOldestMan, RelationType.WIFE);
        Relation relation3 = new Relation(theOldestMan, theMiddleMan, RelationType.PARENT);
        Relation relation4 = new Relation(theMiddleMan, theOldestMan, RelationType.CHILD);
        Relation relation5 = new Relation(theOldestWoman, theMiddleMan, RelationType.PARENT);
        Relation relation6 = new Relation(theMiddleMan, theOldestWoman, RelationType.CHILD);
        Relation relation7 = new Relation(theOldestMan, theMiddleWoman, RelationType.PARENT);
        Relation relation8 = new Relation(theMiddleWoman, theOldestMan, RelationType.CHILD);
        Relation relation9 = new Relation(theOldestWoman, theMiddleWoman, RelationType.PARENT);
        Relation relation10 = new Relation(theMiddleWoman, theOldestWoman, RelationType.CHILD);
        Relation relation11 = new Relation(theMiddleMan, theMiddleWoman, RelationType.BROTHER);
        Relation relation12 = new Relation(theMiddleWoman, theMiddleMan, RelationType.SISTER);
        Relation relation13 = new Relation(theMiddleMan, theMiddleMansWife, RelationType.HUSBAND);
        Relation relation14 = new Relation(theMiddleMansWife, theMiddleMan, RelationType.WIFE);
        Relation relation15 = new Relation(theMiddleMan, theYoungest, RelationType.PARENT);
        Relation relation16 = new Relation(theYoungest, theMiddleMan, RelationType.CHILD);
        Relation relation17 = new Relation(theMiddleMansWife, theYoungest, RelationType.PARENT);
        Relation relation18 = new Relation(theYoungest, theMiddleMansWife, RelationType.CHILD);
        Relation relation19 = new Relation(theMiddleWoman, theYoungest, RelationType.AUNT);
        Relation relation20 = new Relation(theYoungest, theMiddleWoman, RelationType.NIECE);
        Relation relation21 = new Relation(theOldestMan, theYoungest, RelationType.GRANDPARENT);
        Relation relation22 = new Relation(theYoungest, theOldestMan, RelationType.GRANDCHILD);
        Relation relation23 = new Relation(theOldestWoman, theYoungest, RelationType.GRANDPARENT);
        Relation relation24 = new Relation(theYoungest, theMiddleWoman, RelationType.GRANDCHILD);
        Relation relation25 = new Relation(thePet1, theMiddleMan, RelationType.CAT);
        Relation relation26 = new Relation(theMiddleMan, thePet1, RelationType.OWNER);
        Relation relation27 = new Relation(thePet1, theMiddleMansWife, RelationType.CAT);
        Relation relation28 = new Relation(theMiddleMansWife, thePet1, RelationType.OWNER);
        Relation relation29 = new Relation(thePet1, theYoungest, RelationType.CAT);
        Relation relation30 = new Relation(theYoungest, thePet1, RelationType.OWNER);
        Relation relation31 = new Relation(thePet2, theMiddleMan, RelationType.DOG);
        Relation relation32 = new Relation(theMiddleMan, thePet2, RelationType.OWNER);
        Relation relation33 = new Relation(thePet2, theMiddleMansWife, RelationType.DOG);
        Relation relation34 = new Relation(theMiddleMansWife, thePet2, RelationType.OWNER);
        Relation relation35 = new Relation(thePet2, theYoungest, RelationType.DOG);
        Relation relation36 = new Relation(theYoungest, thePet2, RelationType.OWNER);
    }
}
