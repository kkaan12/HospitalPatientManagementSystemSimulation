//This class was created to maintain a list of patients requiring hospitalization in a linked list format.

public class PatientList {
    private Node head;
    private class Node{
        Patient data;
        Node next;

        Node(Patient data){
            this.data=data;
            this.next=null;
        }
    }
    //This method is for adding a new patient to the patient list.
    public void addPatient(Patient p){
        Node newNode=new Node(p);

        if (head==null){
            head=newNode;
            return;
        }
        else{
            Node temp=head; //In this way, we reach the end of the list by creating a temporary node.
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    //This method is used to remove a patient with the desired identification number from the patient list.
    public void removePatient(int id){
        if(head==null){        // The list is checked to see if it's empty.
            System.out.println("List is EMPTY!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(head.data.id==id){  //If the patient to be deleted is at the top of the list, the head will be the next node.
                head=head.next;
            }
            Node prev=head;     // Previous and current nodes are used for deletion from the middle or end.
            Node current=head.next;
            while (current!=null){
                if(current.data.id==id){
                    prev.next=current.next;
                    return;
                }
                prev=current;
                current=current.next;
            }

        }
    }
    //It finds the desired patient using their ID information.
    public Node findPatient(int id){
        Node current=head;
        while(current!=null){
            if(current.data.id==id){
                System.out.println("ID: "+current.data.id+" is found.");// The list is reviewed from beginning to end.
                return current;
            }
            current=current.next;
        }
        System.out.println("Not valid!");
        return null;
    }
    //Prints the list to the screen.
    public void printList(){
        Node current=head;
        if (current==null){
            System.out.println("Patient list is empty!!");
            System.out.println();
            return;
        }
        while (current!=null){
            System.out.println("ID: "+current.data.id+"\nName: "+current.data.name+"\nAge: "+current.data.age+"\nSeverity: "+current.data.severity);
            System.out.println("-----------------------------");
            current=current.next;
        }

    }

    // Because the Heap Sort algorithm works with arrays,
    // the patients in the linked list were first converted into an array.
    public Patient[] toArray(){
        int count=0;
        Node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;

        }

        Patient[] array=new Patient[count+1];
        temp=head;
        int i=1;

        while(temp!=null){
            array[i++]=temp.data;
            temp=temp.next;
        }
        return array;
    }
    // Patients were sorted from smallest to largest according to their severity using the heap sort.
    public void heapSortBySeverity(){
        Patient[] array=toArray();
        int n=array.length-1;

        for (int i=n/2; i>=1; i--){
            heapify(array, n, i);
        }

        // The largest element in the heap is placed last at each step for sorting.
        for(int i=n; i>1; i--){

            //The largest element and the last element swap places.
            Patient temp=array[1];
            array[1]=array[i];
            array[i]=temp;

            heapify(array, i-1, 1);
        }

        System.out.println("---- Patients Sorted By Severity ----");
        for(int i=1; i<=n; i++){
            System.out.println("ID: "+array[i].id+"\nName: "+array[i].name+"\nSeverity: "+array[i].severity);
            System.out.println();
        }
    }
    // This method fixes the heap order starting from a given node.

    public void heapify(Patient[] array, int n, int i){
        int parent=i;
        int lchild= 2*i;
        int rchild= 2*i+1;


        // If the left child is larger than the parent, it is marked as the largest element.
        if (lchild<=n && array[lchild].severity > array[parent].severity){
            parent=lchild;
        }

        // The right child is updated if it is larger than the largest element so far.
        if(rchild <= n && array[rchild].severity > array[parent].severity){
            parent=rchild;
        }

        if(parent != i){

            // Parent and eldest child switch places.
            Patient temp= array[i];
            array[i]=array[parent];
            array[parent]=temp;

            heapify(array, n, parent);
        }
    }
}
