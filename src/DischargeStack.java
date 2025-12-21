// This class represents a stack structure
// that manages discharged patients using LIFO (Last In First Out) logic.
public class DischargeStack {
    private Node top;
    private int size;

    // The node structure in the stack that keeps a record of discharged patients.
    public class Node {
        DischargeRecord data;
        Node next;

        Node(DischargeRecord data){
            this.data=data;
            this.next=null;
        }
    }

    // This method adds a new patient discharge record to the top of the stack.
    public void push(DischargeRecord record){
        Node newNode=new Node(record);
        newNode.next=top;
        top=newNode; // Adds the new node to the top.
        size++;
    }

    // This method extracts the discharge record at the top of the stack.
    public DischargeRecord pop(){
        if(top==null){
            System.out.println("List is empty!!");
            return null;
        }
        DischargeRecord removed=top.data; // The discharge record is kept safe so it doesn't get lost.
        top=top.next;
        size--;
        return removed;
    }

    // Returns without deleting the record at the top of the stack.
    public DischargeRecord peek(){
        if (top==null){
            return null;
        }
        return top.data;
    }

    // Stackte prints the discharge records.
    public void printStack(){
        Node current=top;
        if(top==null){
            System.out.println("Discharge stack is empty.");
            System.out.println();
            return;
        }
        while (current!=null){
            System.out.println("Patient ID: "+current.data.patientId+"\nDischarge Time: "+current.data.dischargeTime);
            System.out.println();
            current=current.next;
        }
    }


}
