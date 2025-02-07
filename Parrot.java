// Subclass: Parrot
class Parrot extends Bird {
    private boolean canMimic; // Property specific to Parrots

    // Constructor Overloaded
    public Parrot(String color, int age, boolean canMimic) {
        super("Parrot", color, age);
        this.canMimic = canMimic;
    }

    // Constructor Overloaded
    public Parrot(String name, String color, int age, boolean canMimic) {
        super(name, color, age);
        this.canMimic = canMimic;
    }

    @Override
    public void fly() {
        System.out.println(name + " flaps quickly and chatters while flying.");
    }
}