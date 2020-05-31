package Lafore.CHAPTER_4.Stacks_And_Queues.LISTING_4_1;

public class StackApp {

    public static void main(String[] args) {

        StackX theStack = new StackX(10);

        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(100);
        theStack.push(120);
        theStack.push(140);
//        theStack.push(160);
//        theStack.push(180);
//        theStack.push(200);
//        theStack.push(220);
//        theStack.push(240);


        while (!theStack.isEmpty()){

            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");

        }

        System.out.println("");

    }
}
