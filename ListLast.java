//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    //save the last element in an int
    int lastElement = ray.get(ray.size() - 1);
    //for loop to loop through every element except the last one
    for (int i = 0; i < ray.size() - 1; i++)
    {
    	//if the current element is equal to the last element
      if (ray.get(i) == lastElement)
      {
        //return true
        return true;
      } 
      //if not, keep searching
    }				
    //if it gets here, then the search never found a duplicate, so return false
		return false;
	}
}