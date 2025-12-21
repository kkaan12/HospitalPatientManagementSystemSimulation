// This class keeps track of a patient's discharge information and time.
public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId) {
        this.patientId=patientId;
        this.dischargeTime=System.currentTimeMillis();
    }
}
