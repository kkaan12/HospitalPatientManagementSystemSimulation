public class TestTreatment {
    public static void main(String[] args){
        TreatmentQueue t=new TreatmentQueue();
        // Add new request to the queue.
        t.enqueue(new TreatmentRequest(1001));
        t.enqueue(new TreatmentRequest(1002));
        t.enqueue(new TreatmentRequest(1003));
        t.enqueue(new TreatmentRequest(1004));
        t.enqueue(new TreatmentRequest(1005));
        t.enqueue(new TreatmentRequest(1006));
        t.enqueue(new TreatmentRequest(1007));
        t.enqueue(new TreatmentRequest(1008));

        // Prints the queue to the screen
        System.out.println("=== Treatment Queue ===");
        t.printQueue();

        // Remove request from queue.
        t.dequeue();
        t.dequeue();
        t.dequeue();

        // Prints the queue to the screen.
        System.out.println("=== After Dequeue ===");
        t.printQueue();

    }
}
