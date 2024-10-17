package instance;

public class this_keywords {
    // Properties (fields)
    private String name;
    private int age;

    // No-argument constructor
    public this_keywords() {
        // Initialize with default values
        this("Unknown", 0); // Calls the parameterized constructor
    }

    // Parameterized constructor
    public this_keywords(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to return the current object
    public this_keywords getSelf() {
        return this;
    }

    public static void main(String[] args) {
        // Creating objects using the no-argument constructor
        this_keywords person1 = new this_keywords();
        
        // Creating objects using the parameterized constructor
        this_keywords person2 = new this_keywords("Alice", 30);
        this_keywords person3 = new this_keywords("Bob", 25);

        // Displaying initial details
        System.out.println("Initial details:");
        person1.displayInfo(); // Should display default values
        person2.displayInfo();
        person3.displayInfo();

        // Modifying the properties of person1
        person1.setName("Charlie");
        person1.setAge(20);

        // Displaying modified details
        System.out.println("\nModified details:");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        // Using `this` to return the current object
        System.out.println("\nCurrent object returned by getSelf():");
        this_keywords self = person1.getSelf();
        self.displayInfo();
    }
}
