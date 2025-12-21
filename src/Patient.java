// This class keeps track of the patient's basic information and priority status.
public class Patient {
    int id;
    String name;
    int severity;
    int age;

    public Patient(int id, String name,int severity,int age){
        this.id=id;
        this.name=name;
        this.age=age;
        this.severity=severity;
    }
}
