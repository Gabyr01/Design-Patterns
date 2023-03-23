package classFundamentals;

public class Main {
    public static void main(String[] args) {

        //creating an vlueprint object
        Blueprint myObj = new Blueprint(21, "auran");
        System.out.println(myObj.x + " "+ myObj.name);
        //modify attributes
        myObj.x = 40;
        System.out.println(myObj.x);

        //the final field Blueprint.y cannot be assigned
        //myObj.y = 40;

        //calling static method
        Blueprint.myStaticMethod();

        //calling public method 
        myObj.myPublicMethod();
    }
}
