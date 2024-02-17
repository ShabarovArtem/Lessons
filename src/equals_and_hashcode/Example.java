package equals_and_hashcode;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("Artem", 2019);
        Child child2 = new Child("Slava", 2019);
        Child child3 = new Child("Egor", 2019);
        Child child4 = new Child("Tajik", 2019);

        Child[] children = {child1,child2,child3,child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean reseult = false;
        Child childForFind = new Child("Artem", 2019);

        for (Child child : childrenGarden.getChildren()) {
//            if (child.getName().equals("Egor") && child.getYear() == 2019){
            if (child.equals(childForFind)){
                reseult = true;
                break;

            }
        }
        System.out.println(reseult);

    }
}
