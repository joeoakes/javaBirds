// Subclass: Eagle
class Eagle extends Bird {
    //Constructor method
    public Eagle(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high with powerful wings.");
    }
}
