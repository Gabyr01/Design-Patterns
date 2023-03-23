package classFundamentals;
/*
https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/

A Class is a blueprint for an object. 
we use classes to create objects
So a class describes what an object will be, but it isn't the object itself.
------
classes describe the type of objects
objects are usable instances of classes
-----

*/

//to create a class, use the keyword class
public class Blueprint {
    //public attribute
    int x;
    String name; 
    //if you don't want to override existing values use final 
    final int y = 2;


    //Create a class constructor for the Main class
    public Blueprint(int x, String n) {
        this.x = x;
        this.name = n;
    }
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


}