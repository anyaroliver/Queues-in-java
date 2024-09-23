import java.util.LinkedList;
import java.util.Queue;

// *******************************************************

// Queue = FIFO data structure. First-In First-Out
//                A collection designed for holding elements prior to processing
//                Linear data structure

//      enqueue = offer()
//      dequeue = poll()

// Where are queues useful?

// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
// 2. Printer Queue (Print jobs should be completed in order)
// 3. Used in LinkedLists, PriorityQueues, Breadth-first search

// *******************************************************

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("John");
        queue.offer("Will");
        queue.offer("Bale");
        queue.offer("Mary");

        // This here removes element from the queue
        queue.poll();
        // This here checks the size of the queue
        System.out.println(queue.size());
        // This here checks if the queue is empty or not
        System.out.println(queue.isEmpty());
        System.out.println(queue);

    }

}
