public class TestHospitalSystem {

    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();

        // Add 10 patients.
        system.addPatient(new Patient(1001, "Kaan Oral ", 3, 30));
        system.addPatient(new Patient(1002, "Turgut Özben ", 7, 45));
        system.addPatient(new Patient(1003, "Selim Işık ", 5, 60));
        system.addPatient(new Patient(1004, "Mehmet Kaya ", 2, 25));
        system.addPatient(new Patient(1005, "Can Bozok ", 9, 40));
        system.addPatient(new Patient(1006, "Elif Yılmaz ", 6, 35));
        system.addPatient(new Patient(1007, "Murat Elmas ", 4, 50));
        system.addPatient(new Patient(1008, "Deniz Tekin ", 8, 28));
        system.addPatient(new Patient(1009, "Selin Arı ", 1, 20));
        system.addPatient(new Patient(1010, "Ahmet Türk ", 5, 55));

        // Treatment requests
        system.addTreatmentRequest(1001);
        system.addTreatmentRequest(1008, true);   // priority
        system.addTreatmentRequest(1005, true);   // priority
        system.addTreatmentRequest(1003);
        system.addTreatmentRequest(1002);
        system.addTreatmentRequest(1004);
        system.addTreatmentRequest(1010);


        System.out.println("\n===== INITIAL SYSTEM STATE =====");
        system.printSystemState();

        //
        system.processNextTreatment();
        system.processNextTreatment();
        system.processNextTreatment();
        system.processNextTreatment();

        System.out.println("\n===== AFTER PROCESSING TREATMENTS =====");
        system.printSystemState();

        // Heap Sort Testing
        System.out.println("\n===== SORTED PATIENTS BY SEVERITY (HEAP SORT) =====");
        system.sortPatientsBySeverity();
    }
}
