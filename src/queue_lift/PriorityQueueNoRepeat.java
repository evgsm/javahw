package queue_lift;

import java.util.PriorityQueue;

public class PriorityQueueNoRepeat<E> extends PriorityQueue<E> {
    @Override
    public boolean offer(E e) {
        if(this.contains(e)) {
            return true;
        }
        return super.offer(e);
    }
}
