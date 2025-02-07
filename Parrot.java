// Subclass: Parrot
class Parrot extends Bird {
    //Constructor method
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println(name + " flaps quickly and chatters while flying.");
    }
}