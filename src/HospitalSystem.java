import java.util.HashMap;
public class HospitalSystem  {
    private PatientList patientList;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientMap; // HashMap used to provide quick access to patients via ID.
    private TreatmentQueue priorityQueue;
    private TreatmentQueue normalQueue;


    // All data structures are created within the constructor.
    public HospitalSystem() {
        patientList=new PatientList();
        normalQueue=new TreatmentQueue();
        priorityQueue=new TreatmentQueue();
        dischargeStack=new DischargeStack();
        patientMap=new HashMap<>();

    }

    // Adds the new patient to the system and saves it to the HashMap.
    public void addPatient(Patient p){
        patientList.addPatient(p);
        patientMap.put(p.id, p);

    }

    // Method used to add a normal (non-priority) treatment request.
    public void addTreatmentRequest(int patientId){
        addTreatmentRequest(patientId,false);
    }

    // Adds the patient's priority or regular treatment request to the appropriate queue.
    public void addTreatmentRequest(int patientId, boolean isPriority){
        Patient p=patientMap.get(patientId);
        if(p!=null){
            TreatmentRequest request=new TreatmentRequest(patientId, isPriority);

            if(isPriority){
                priorityQueue.enqueue(request);
            }else {
                normalQueue.enqueue(request);
            }
        }
    }

    // Adds the patient who has completed treatment to the discharge stack.
    public void addDischargeRecord(int patientId){
        dischargeStack.push(new DischargeRecord(patientId));

    }

    // The operation is first performed via the priority queue, and if it is free, via the regular queue.
    public void processNextTreatment(){
        TreatmentRequest r;

        if (priorityQueue.size() > 0) {
            r = priorityQueue.dequeue();
        } else {
            r = normalQueue.dequeue();
        }

        if (r != null) {
            addDischargeRecord(r.patientId);
        }
    }

    // Prints the current status of all structures in the system to the screen.
    public void printSystemState(){
        System.out.println(" ---- Patient List ---- ");
        patientList.printList();
        System.out.println(" ---- Priority Treatment Queue ----");
        priorityQueue.printQueue();
        System.out.println(" ---- Normal Treatment Queue ----");
        normalQueue.printQueue();
        System.out.println(" ---- Discharge Stack ---- ");
        dischargeStack.printStack();
    }

    // Sorts patients by severity using heap sort.
    public void sortPatientsBySeverity() {
        patientList.heapSortBySeverity();
    }

}
