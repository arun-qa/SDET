package week3.day2;

import java.util.Collection;
import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class UniqueOccurences {
	
	@Test
	public void test1() {
		Assert.assertEquals(true, uniqueOccurrences(new int[] { 1, 2, 3, 1, 2, 1 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, uniqueOccurrences(new int[] { 2, 3, 1, 2, 1 }));
	}
	
	
	public boolean uniqueOccurrences(int[] arr) {

        int count =0;
        HashMap<Integer, Integer> nMap = new HashMap<Integer, Integer>();
        for(int i=0;i< arr.length;i++){
            count =0;
            for (int j =0;j< arr.length;j++){

                if(arr[i] == arr[j]){
                    count++;

                }
            }
            nMap.put(arr[i],count);
        }
        System.out.println(nMap.values());
        Collection<Integer> arrNew = nMap.values();
        Object[] ar = arrNew.toArray();
        for(int i=0;i<arrNew.size()-1;i++){
            if(ar[i]  == ar[i+1]){
                return false;
            }
        }
        return true;
	}

}
