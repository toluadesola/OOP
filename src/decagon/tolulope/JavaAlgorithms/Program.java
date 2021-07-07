package decagon.tolulope.JavaAlgorithms;

// Feel free to add new properties and methods to the class.
class Program {
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            // Write your code here.
            if(head == null){
                head = node;
            }else{
                Node n_node = node.next;
                Node p_node = node.prev;

                n_node.prev = p_node;
                p_node.next = n_node;

                head.prev = node;
                node.prev = null;
                node.next = head;
                head = node;
            }

        }

        public void setTail(Node node) {
            // Write your code here.
            if(tail == null){
                tail = node;
            }else{
                Node t_node = node.next;
                Node p_node = node.prev;

                t_node.prev = p_node;
                p_node.next = t_node;

                tail.next = node;
                node.next = null;
                node.prev = tail;
                tail = node;
            }

        }

        public void insertBefore(Node node, Node nodeToInsert) {
            // Write your code here.
            node.prev = nodeToInsert;
            System.out.println(nodeToInsert.value);
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            // Write your code here.
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            // Write your code here.
            int count = 1;
//       while(node.next != null){
//         node = node.next;
//         count++;
//         if(count == position){
//           node = nodeToInsert;
//         }
//       }
        }

        public void removeNodesWithValue(int value) {
            // Write your code here.
        }

        public void remove(Node node) {
            // Write your code here.
        }

        public boolean containsNodeWithValue(int value) {
            System.out.println(head.next.value);
            Node node = head;
            while(node.next != null){
                if(node.next.value == value){
                    return true;
                }
                node = node.next;
            }
            // Write your code here.
            return false;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}