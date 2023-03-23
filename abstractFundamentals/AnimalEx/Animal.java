package abstractFundamentals.AnimalEx;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
      System.out.println("Zzz");
    }
  }

/*
 * NOT POSSIBLE TO CREATE an Object of the animal class
 * Animal myObj = new Animal(); // will generate an error
 */