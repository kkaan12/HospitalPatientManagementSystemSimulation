// This class represents a request for patient treatment.
public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean isPriority;

    // Constructor that creates a normal (non-priority) treatment request.
    public TreatmentRequest(int patientId){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.isPriority=false;
    }

    // Constructor that creates a priority or normal treatment request.
    public TreatmentRequest(int patientId, boolean isPriority){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.isPriority=isPriority;
    }
}
