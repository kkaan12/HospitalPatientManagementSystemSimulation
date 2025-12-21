// This class represents a queue structure that manages
// patients' treatment requests according to the FIFO (First In First Out) logic.
public class TreatmentQueue {
    private Node front;
    private Node rear;
    private int size;

    // Node structure that holds treatment requests
    private class Node {
        TreatmentRequest data;
        Node next;

        Node(TreatmentRequest data){
            this.data=data;
            this.next=null;
        }
    }

    // This method adds the new treatment request to the end of the queue.
    public void enqueue(TreatmentRequest request){
        Node newNode= new Node(request);

        if(front==null){  /// If the queue is empty, the front and rear nodes point to the same node.
            front=newNode;
            rear=newNode;
        } else {          /// If the queue is full, a new node is added to the end of the rear queue.
            rear.next=newNode;
            rear=newNode;

        }
        size++;
    }

    // This method removes the initially added treatment request.
    public TreatmentRequest dequeue() {
        if(front==null){
            return null;
        }
        TreatmentRequest removedRequest = front.data; //They keep it to ensure the desire for treatment doesn't disappear.
        front=front.next;
        size--;
        if(front==null){
            rear=null;
        }
        return removedRequest;
    }
    // This method keeps track of the queue size.
    public int size(){
        return size;
    }
    // This method prints the queue to the display.
    public void printQueue(){
        Node current=front;
        if(current==null){
            System.out.println("Queue is empty!!");
            System.out.println();
            return;
        }
        while(current!=null){
            System.out.println("Patient ID: "+current.data.patientId+"\nArrival Time: "+current.data.arrivalTime);
            System.out.println();
            current=current.next;
        }
    }
}
