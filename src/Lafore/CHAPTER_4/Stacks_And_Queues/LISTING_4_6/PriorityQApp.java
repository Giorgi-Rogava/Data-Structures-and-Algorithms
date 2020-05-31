package Lafore.CHAPTER_4.Stacks_And_Queues.LISTING_4_6;

public class PriorityQApp {

    public static void main(String[] args) {

        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(30);
        priorityQ.insert(50);
        priorityQ.insert(10);
        priorityQ.insert(40);
//        priorityQ.isFull();
        priorityQ.insert(20);


        while (!priorityQ.isEmpty()) {

            long item = priorityQ.remove();
            System.out.print(item + " ");
        }

        System.out.println("");

    }

}
