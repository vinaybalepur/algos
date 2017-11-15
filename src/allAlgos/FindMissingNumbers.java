package allAlgos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindMissingNumbers 
{
	public static void main(String[] args) {
		int arr1[] = {203,204,205,206,207,208,203,204,205,206};
		int arr2[] = {203,204,204,205,206,207,205,208,203,206,205,206,204};
		findMissingNumbers(arr1, arr2);
	}
	
	
	static void findMissingNumbers(int arr1[], int arr2[])
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int arraylen =0;
        int arr1_pointer=0;
        int arr2_pointer=0;
        Set<Integer> set = new LinkedHashSet<Integer>();
        if(arr1.length>arr2.length)
        {
            arraylen = arr1.length;
        }else
        {
            arraylen = arr2.length;
        }
        
        for(int i=0;i<arraylen;i++)
        {
            if(arr1[arr1_pointer] == arr2[arr2_pointer])
            {
                arr1_pointer = arr1_pointer+1;
                arr2_pointer = arr2_pointer+1;
            }else
            {
                if(arr1.length>arr2.length)
                {
                    set.add(arr1[arr1_pointer]);
                    arr1_pointer = arr1_pointer+1;
                }else
                {
                    set.add(arr2[arr2_pointer]);
                    arr2_pointer = arr2_pointer+1;
                }
            }
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }
	

}
