public class Sll {
    public Node head;
    public Sll() {
        this.head = null;

    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    
    public void printValues(){
        Node runner = head;
        while(runner.next != null){
            System.out.println(runner.value);
            runner = runner.next;
        } 
    }
    public void remove(){
        Node runner = head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }

}