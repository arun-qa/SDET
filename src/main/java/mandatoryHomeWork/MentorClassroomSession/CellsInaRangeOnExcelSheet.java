package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

/*Pseudocode
 * Get an input as String
 * Output should be string of Array
 * create a new list to add the values
 * Initialise start column as 0th char from the input string
 * Initialise end column as 3rd char from the input string
 * Initialise start row as 1st char from the input string
 * Initialise end row as 4th char from the input string
 * Iterate one for loop for the columns
 * Iterate one for loop for the rows
 * for each iteration concatenate rows & columns value
 * Add the values to the result & return the result
 */

public class CellsInaRangeOnExcelSheet {
	
	@Test
	public void test1()
	{
		String input = "K1:L2";
		List<String> output = new ArrayList<>(Arrays.asList("K1","K2","L1","L2"));
		List<String> actOutput = cellsInRange(input);
		Assert.assertEquals(output, actOutput);
	}
	
public List<String> cellsInRange(String s) {
	
	List<String> result = new ArrayList<String>();
	
	//char[] chars = new char[2];
	
	char startcol = s.charAt(0);
	char endcol = s.charAt(3);
	
	int startrow = s.charAt(1) - '0';
	int endrow = s.charAt(4) - '0';
	
	for(char col=startcol; col<=endcol; col++)
	{
		for(int row=startrow; row<=endrow; row++)
		{
			//chars[0] = col;
			//chars[1] = row;
			//result.add(new String(chars));
			
			String cell = col + Integer.toString(row);
			result.add(cell);
		}
	}
	
	return result;
        
    }

}
