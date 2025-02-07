
// Main class to test polymorphism
public abstract class Main {
    public static void main(String[] args) {

        //Create three Bird objects
        Bird myEagle = new Eagle("Brown and White", 3, 3.5);
        Bird myParrot = new Parrot("Macaw", "Green", 4, true);
        Bird myPenguin = new Penguin("Emperor Penguin", "Black and White", 5, 3.5);

        myEagle.fly();
        myParrot.fly();
        myPenguin.fly();
    }
}