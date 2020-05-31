package Lafore.CHAPTER_2.Arrays.LISTING_2_3.HighArray;

public class HighArrayApp {

    public static void main(String[] args) {


        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);


        arr.insert(-1);
        arr.insert(0);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;

        if (arr.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't Find " + searchKey);
        }

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);


        arr.display();

        System.out.println(arr.getMax());
        arr.displaynElems();
        arr.display();
        arr.removeMax();
        arr.display();
        arr.removeMax();
        arr.removeMax();
        arr.display();


    }


}
