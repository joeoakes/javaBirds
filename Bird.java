// Superclass: Bird
class Bird {
    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void fly() {
        System.out.println(name + " is flying in a general way.");
    }
}
