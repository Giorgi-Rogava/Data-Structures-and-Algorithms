package Lafore.CHAPTER_3.SIMPLE_SORTING.LISTING_3_3;

public class InsertSortApp {


    public static void main(String[] args) {


        int maxSize = 100;

        ArrayIns arr;
        arr = new ArrayIns(maxSize);

        arr.insert(22);
        arr.insert(44);
        arr.insert(55);
        arr.insert(77);
        arr.insert(99);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);


        arr.display();          // display items

        arr.insertionSort();          // insertion-sort them

        arr.display();
    }

}
