package decagon.tolulope.JavaAlgorithms;

class ProgramLinkedList {
    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        LinkedList dummy = null;
        LinkedList currentHead = null;

        while (head != null) {
            // set dummy as the value after head
            dummy = head.next;
            // set head.next as the value of current head from the last loop
            head.next = currentHead;
            // save head inside currentHead
            currentHead = head;
            // reassign dummy variable to head for next loop
            head = dummy;
        }
        return currentHead;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}