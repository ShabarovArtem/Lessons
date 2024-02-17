package hashcode;

import equals_and_hashcode.Child;
import equals_and_hashcode.ChildrenGarden;

public class HashcodeExaple {
    public static void main(String[] args) {
        Child child1 = new Child("Artem", 2018);
        Child child2 = new Child("Slava", 2018);
        Child child3 = new Child("Egor", 2019);
        Child child4 = new Child("Tajik", 2019);

        Child[] group0 = {child3,child2};
        Child[] group1 = {child1,child4};
        Child[][] children = {group0,group1};

        Child childForFind = new Child("Artem", 2018);

        ChildrenGardenWhithGroup childrenGardenWhithGroup = new ChildrenGardenWhithGroup(children);

        boolean result = false;
        for (Child child : childrenGardenWhithGroup.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)){
                result = true;
                break;
            }
        }


    }
}
