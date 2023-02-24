import java.lang.*;



public class Api {
    /*
    reversestring() is used to reverse the string
     */
    public String reverseString(String input_string)
    {
        char extract_char;
        String rev_string ="";

        /*
        iterate to reverse the string
         */
        for (int i=0; i<input_string.length(); i++)
        {
            extract_char= input_string.charAt(i); //extracts each character
            rev_string= extract_char + rev_string; //adds each character in front of the existing string
        }
        return rev_string;
    }

    /*
    getstringlength() method is for finding the length of the string
     */
    public int getStringLength(String input_string )
    {
        int length=0;

        char char_Array[]=input_string.toCharArray();

        for(char char_index : char_Array)
        {
            length++;
        }
        return length;
    }

}
