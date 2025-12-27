//The accuracy of the PatientList structure is tested.

public class TestPatient {
    public static void main(String[] args){
        PatientList p= new PatientList();
        //Adding patients
        p.addPatient(new Patient(1001,"Kaan Oral",2,21));
        p.addPatient(new Patient(1002,"Turgut Özben",6,57));
        p.addPatient(new Patient(1003,"Hikmet Yılmaz",9,82));
        p.addPatient(new Patient(1004,"Selim Işık",3,35));
        p.addPatient(new Patient(1005,"Mehmet Kaya",1,16));

        System.out.println("--- First Patient List ---");
        p.printList();
        //Removing patients
        p.removePatient(1004);
        System.out.println("--- Patient List After Deleting ID 1004  ---");
        p.printList();
        //Finding patients
        System.out.println("ID 1003 is searching...");
        p.findPatient(1003);

        System.out.println("--- Final Patient List ---");
        p.printList();

    }

}
