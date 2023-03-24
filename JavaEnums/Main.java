package JavaEnums;

class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
    
        switch(myVar) {
          case LOW:
            System.out.println("Low level");
            break;
          case MEDIUM:
             System.out.println("Medium level");
            break;
          case HIGH:
            System.out.println("High level");
            break;
        }
// The enum type has a values() method, which returns an array of all enum constants. 
        for (Level myV : Level.values()) {
            System.out.println(myV);
          }
      }
}
