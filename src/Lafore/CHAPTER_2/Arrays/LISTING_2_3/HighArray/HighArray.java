package Lafore.CHAPTER_2.Arrays.LISTING_2_3.HighArray;

public class HighArray {

    private long[] a;
    private int nElems;


    public HighArray(int max) {

        a = new long[max];
        nElems = 0;
    }


    public boolean find(long searchkey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchkey) {
                break;
            }
        }

        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }


    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == value) {
                break;
            }
        }

        if (j == nElems) {
            return false;

        } else {

            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }

    }

    public long getMax() {
        long max = -1;
        if (nElems == 0) {
            return max;
        } else {
            max = a[0];
            for (int i = 1; i < nElems; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
        }

        return max;
    }


    public long removeMax() {
        long max = -1;
        if (nElems == 0) {
            return max;
        } else {
            max = getMax();
            delete(max);
            return max;
        }
    }

    public void displaynElems() {
        System.out.println("nElems " + nElems); // number of elements
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
