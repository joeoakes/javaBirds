// Superclass: Bird
class Bird {
    protected String name;
    protected String color;
    protected int age;

    //Constructor method
    public Bird(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;}

    public String getColor() { return color; }

    public void setColor(String color) {this.color = color; }

    public int getAge() { return age;}

    public void setAge(int age) {this.age = age;    }

    public void fly() {
        System.out.println(name + " is flying in a general way.");
    }
}
