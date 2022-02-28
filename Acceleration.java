import java.util.Scanner;
public class Acceleration{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the starting velocity in meters/second ");
     double startingVelocity = input.nextDouble();

     System.out.println("Enter the ending velocity in meters/second ");
     double endingVelocity = input.nextDouble();

     System.out.println("Enter the time span in seconds ");
     double timeSpan = input.nextDouble();

     double averageAcceleration = ((endingVelocity - startingVelocity)/ timeSpan);

     System.out.printf("The average acceleration is %.4f%n ",averageAcceleration);

     }
}
