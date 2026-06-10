package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
    static void main() {
        Queue<Integer> pq = new PriorityQueue<>();
        //Default behavior - Integer -Less value->High priority -> minheap(same behavior)
        pq.offer(20);
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        // opposite of default condition - using comparator
        Queue<Integer> p = new PriorityQueue<>((a,b)->b-a);
        // maxheap - Integer - high value - high priority
        p.offer(28);
        p.offer(4);
        p.offer(16);
        p.offer(3);
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
    }
}
/*
PriorityQueue in Java

A PriorityQueue is a special type of queue where elements are processed
according to their priority, not according to insertion order.

 */
