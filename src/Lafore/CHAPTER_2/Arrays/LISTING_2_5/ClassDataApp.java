package Lafore.Person;

public class ClassDataApp {

    public static void main(String[] args) {

        int maxSize = 100;

        ClassDataArray arr;

        arr = new ClassDataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.displayA();

        String searchkey = "Stimson";

        Person found;

        found = arr.find(searchkey);

        if (found != null) {

            System.out.println("");

            System.out.print("Found ");

            found.displayPerson();

            System.out.println("");

        } else {
            System.out.println("");
            System.out.println("Can't find " + searchkey);
            System.out.println("");
        }


        System.out.println("Deleting Smith, Yee, and Creswell");

        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");


        System.out.println("");
        arr.displayA();
        System.out.println("");
    }
}
