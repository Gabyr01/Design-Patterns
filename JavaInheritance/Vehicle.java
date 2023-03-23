package JavaInheritance;

class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    //This access modifier is used to access the methods or data members 
    //of a class within the same package as well as outside the package but only through inheritance.
    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
  }