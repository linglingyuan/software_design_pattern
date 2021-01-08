public class PhoneAdaptee {
    public static void main(String[] args) {
        PhoneAdaptee phoneAdaptee = new PhoneAdaptee();
        phoneAdaptee.charge(new VoltageAdapter(new Voltage220V()));
    }
    public void charge(Voltage5V voltage5V){
        System.out.println("电压" + voltage5V.output5V());
    }
}
