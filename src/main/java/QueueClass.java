public class QueueClass {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        static Node head = null;
        static Node tail = null;


        static boolean isEmpty() {
            return head == null & tail == null;
        }

        static void addElement(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
          }
          public static int remove(){
           if (isEmpty()){
               System.out.println("empty");
               return -1;
           }
           int front = head.data;
           if (head==tail){
               tail=null;
           }
           head= head.next;
              return front;
          }
          public static int peek(){
            if (isEmpty()){
                System.out.println("empty");
                return -1;
            }

              return head.data;
          }
    }

    public static void main(String[] args) {
        queue queue = new queue();
        queue.addElement(50);
        queue.addElement(60);
        queue.addElement(70);
        queue.addElement(80);

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
