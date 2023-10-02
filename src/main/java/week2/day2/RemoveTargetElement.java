package week2.day2;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveTargetElement {
	
	@Test
    public void test1(){

        int[] input = {2,3,3,4,5};
        int[] output = {2,4,5};
        int target = 3;
        ArrayList<Integer> list = removeTarget(input, target);
        System.out.println(list);

    }

    @Test
    public void test2(){

        int[] input = {2,2};
        int target = 2;
        ArrayList<Integer> list = removeTarget(input, target);
        Assert.assertTrue(list.isEmpty());

    }

    public ArrayList<Integer> removeTarget(int[] input, int target){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int num:input) {
            if(num != target){
                list.add(num);
            }
        }
        return list;
    }
	
	
	
	
	
	
	
	

}
