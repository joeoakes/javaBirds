// Superclass: Bird
class Bird {
    protected String name;
    protected String color;

    //Constructor method
    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fly() {
        System.out.println(name + " is flying in a general way.");
    }
}
