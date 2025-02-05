// Subclass: Eagle
class Eagle extends Bird {
    public Eagle(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high with powerful wings.");
    }
}
