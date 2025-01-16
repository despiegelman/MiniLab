import java.util.ArrayList;
import java.util.Scanner;
public class MiniLab{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String userInput;
        ArrayList<String> favorites = new ArrayList<String>();
        for (int i = 0; i < 6; i++){
            System.out.print("Enter your favorite color: ");
            userInput = input.nextLine();
            favorites.add(userInput);
        }
        input.close();
        for (String color : favorites){
            System.out.println(color);
        }
        


    }
}