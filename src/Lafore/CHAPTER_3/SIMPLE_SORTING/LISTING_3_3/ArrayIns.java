package Lafore.CHAPTER_3.SIMPLE_SORTING.LISTING_3_3;

public class ArrayIns {

    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }


    public void insertionSort() {

        int in, out;

        for (out = 1; out < nElems; out++) { // 1 დან რატომ ვიწყებთ;

            long temp = a[out];
            in = out;


            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;


        }


    }


    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("");
    }


}
