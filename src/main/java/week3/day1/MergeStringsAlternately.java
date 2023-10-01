package week3.day1;

import org.junit.Test;

import junit.framework.Assert;

public class MergeStringsAlternately {
	
	@Test
	public void test1()
	{
		String str1 = "ab";
		String str2 = "pqrs";
		String actual = checkAppend(str1, str2);
		Assert.assertEquals("apbqrs", actual);
		
	}
	
	public String checkAppend(String str1, String str2){
        int diff = 0;
        String subStr1 = "";
        String subStr2 = "";
        String append = "";
        if(str1.length() > str2.length()){
            diff = str1.length()-str2.length();
            subStr1 = str1.substring(diff);
            for(int i=0;i<str2.length();i++){

                append = append+str1.charAt(i)+str2.charAt(i);

            }
            append = append+subStr1;

        }else{
            diff = str2.length()-str1.length();
            subStr2 = str2.substring(diff);
            for(int i=0;i<str1.length();i++){

                append = append+str1.charAt(i)+str2.charAt(i);

            }
            append = append+subStr2;
        }
		return append;

    }

}
