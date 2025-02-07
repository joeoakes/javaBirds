// Subclass: Eagle
class Eagle extends Bird {
    private double wingspan; // Additional property specific to Eagles

    // Constructor
    public Eagle(String color, int age, double wingspan) {
        super("Eagle", color, age);
        this.wingspan = wingspan;
    }

    //Constructor method
    public Eagle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high with powerful wings.");
    }
}
