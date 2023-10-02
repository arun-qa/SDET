package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CountofMatchesinTournament {
	
	/*
	 * You are given an integer n, the number of teams in a tournament that has strange rules:
	If the current number of teams is even, each team gets paired with another team. 
	A total of n / 2 matches are played, and n / 2 teams advance to the next round.
	If the current number of teams is odd, one team randomly advances in the tournament, 
	and the rest gets paired. A total of (n - 1) / 2 matches are played, 
	and (n - 1) / 2 + 1 teams advance to the next round.
	Return the number of matches played in the tournament until a winner is decided.
	 * 
	 * 
	 * Pseudo code:
	 * 
	 * We need to get the input as int n = 8
	 * if(n%2==0) its consider as even
	 * if it is even then matches = n/2
	 * if it is odd then matches
	 * 
	 * 
	 */
	@Test
	public void test1()
	{
		Assert.assertEquals(9, countofmatches(10));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, countofmatches(1));
	}
	
	public static int countofmatches(int teams)
	{
		int count=0;     //O(1)
		
		while(teams>1)    //O(n)
		{
			if(teams%2==0)   //O(1)
			{
				count = count + teams/2;  //O(log n)
				teams = teams-teams/2;   //O(log n)
			}
			else
			{
				count = count + teams/2;    //O(log n)
				teams = teams-(teams-1)/2;   //O(log n)
			}
		}
		
		return count;
			
	
	}
		
		
}