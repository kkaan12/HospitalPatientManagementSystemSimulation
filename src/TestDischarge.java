public class TestDischarge {
    public static void main(String[] args) {

        DischargeStack s = new DischargeStack();
        // Add new discharge record to the stack.
        s.push(new DischargeRecord(1001));
        s.push(new DischargeRecord(1002));
        s.push(new DischargeRecord(1003));
        s.push(new DischargeRecord(1004));
        s.push(new DischargeRecord(1005));

        System.out.println("--- Discharge Stack ---");
        s.printStack();
        // Remove discharge recort to the top.
        s.pop();
        s.pop();

        System.out.println("--- Stack After Pop ---");
        s.printStack();
    }
}
