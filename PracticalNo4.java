public class PracticalNo4 {

   
    public static void printName(String fullName) {
        
        String[] names = fullName.split(" ");
        
       
        String firstName = names[0];
        String lastName = names[1];
        
        String formattedName = lastName + ", " + firstName;
        
      
        System.out.println(formattedName);
    }

    public static void main(String[] args) {
        printName("ABOLI AMBATKAR");
    }
}
