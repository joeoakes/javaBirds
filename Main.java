
// Main class to test polymorphism
public class Main {
    public static void main(String[] args) {

        //Create three Bird objects
        Bird myEagle = new Eagle("Bald Eagle", "Brown and White");
        Bird myParrot = new Parrot("Macaw", "Green");
        Bird myPenguin = new Penguin("Emperor Penguin", "Black and White");

        myEagle.fly();
        myParrot.fly();
        myPenguin.fly();
    }
}