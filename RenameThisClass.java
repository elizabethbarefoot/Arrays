
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
        int i = 10;
        float f = 2.5f;
        f += i;
        boolean flag = true;
        flag = !flag; 
        String string1 = "This is a string";
        String string2 = "This is a string";
        string1.equals(string2);
        String string3 = "I am also a string";
        boolean stringsequal = string1.equals(string3);
        String[] myArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (int idx = 0; idx < myArray.length; idx++) {
            System.out.print(myArray[idx]);
            if (idx !=myArray.length -1)
                System.out.print("-");
        }
    }
}