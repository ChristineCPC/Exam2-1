/**
 * This class provides one method that should be implemented for
 * Exam 2 - Part 2.
 *
 * @author (M. Rasamny)
 * @version (The only one you need)
 */
public class Exam2
{
    /**
     * swaps adjacent integers in array anArray so that the left element is smaller than
     * the right element.
     * @param anArray array containing integers
     */
    public static void bubble(int[] anArray)
    {
        // TODO: replace this line with your code
        for(int index=0; index<anArray.length-1; index++){
            int num1 = 0;
            int num2 = 0;
            if(anArray[index] > anArray[index+1]){
                num1 = anArray[index];
                num2 = anArray[index+1];
                anArray[index+1] = num1;
                anArray[index] = num2;
            }else{

            }
        }
    }
}
