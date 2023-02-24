import java.util.Scanner;

public class Implement {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String input_string="";
        input_string =input.nextLine();

        Api api_object =new Api (); //creating object of the api class
        System.out.println(api_object.getStringLength(input_string));
        System.out.println(api_object.reverseString(input_string));

    }
}