import java.util.Arrays;

public class Tableau {
    /**
     * @param args
     */
    public static void main (String[] args) {
  int[] tableau = {3, 6 ,9 , 12, 15};
  
System.out.println (sequentialSearch(tableau, 3))
System.out.println (sequentialSearch(tableau, 6))
System.out.println (sequentialSearch(tableau, 9))
System.out.println (sequentialSearch(tableau, 12))
System.out.println (sequentialSearch(tableau, 15))

    }

    public static int sequentialSearch(int[] elements, int target)
    {
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                return j;
            }
        }
        return -1;
    }

}