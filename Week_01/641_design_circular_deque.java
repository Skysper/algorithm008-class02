class MyCircularDeque {
    private int size;
    private final int capacity;
    Node head = null;
    Node tail = null;

    private static class Node {
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }
    }

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        capacity = k;
        size = 0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size == capacity) {
            return false;
        }

        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            Node prevHead = head;
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size == capacity) {
            return false;
        }
        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            Node prevTail = tail;
            tail = node;

            prevTail.next = tail;
            tail.prev = prevTail; 
        }
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(head == null) {
            return false;
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node prevHead = head;
            head = head.next;
            head.prev = null;
        }
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(tail == null) {
            return false;
        }
        if(size == 1) {
            head = null;
            tail = null;
        } else {
            Node prevTail = tail;
            tail = tail.prev;
            tail.next = null;
            prevTail.prev = null;
        }
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(size==0) {
            return -1;
        } else {
            return head.val;
        }
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(size == 0) {
            return -1;
        } else {
            return tail.val;
        }
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
