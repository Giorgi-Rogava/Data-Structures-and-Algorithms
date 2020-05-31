package Lafore.CHAPTER_4.Stacks_And_Queues.LISTING_4_4;

import java.util.Arrays;

public class QueueApp {

    public static void main(String[] args) {

        Queue queue = new Queue(6);


        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);



        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(120);
        queue.insert(100);
        queue.insert(80);

        while (!queue.isEmpty()) {

            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
