/*
 * This program is part of my learning Java series
 * This one looks at if statements
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-7-conditional-world-of-ifs.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

public class temperatureAlarm {

	
	public static void checkTemp (double temp)
	{
		if (temp < 150.0)
		{
			System.out.println("Temperature: " + temp);
			return;
		}
		
		if(temp > 150.0 && temp < 200.0)
		{
			System.out.println("WARNING! Temperature: " + temp);
		}

		if(temp > 200.0 && temp < 250.0)
		{
			System.out.println("DANGER! Temperature: " + temp);
		}

		if(temp > 250.0)
		{
			System.out.println("CRITICAL! Temperature: " + temp);
		}
	
		return;
	}
	
	
	public static void betterTempCheck (double temp)
	{
		if (temp < 150.0)
		{
			System.out.println("Temperature: " + temp);
		}
		else if( temp < 200.0)
		{
			System.out.println("WARNING! Temperature: " + temp);
		}
		else if( temp < 250.0)
		{
			System.out.println("DANGER! Temperature: " + temp);
		}
		else
		{
			System.out.println("CRITICAL! Temperature: " + temp);
		}
	
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BASIC METHOD");
		checkTemp(110.0);
		checkTemp(149.9);
		checkTemp(150.0);
		checkTemp(150.1);
		checkTemp(198.0);
		checkTemp(202.0);
		checkTemp(222.0);
		checkTemp(266.0);
		
		System.out.println("CLEANED METHOD");
		betterTempCheck(110.0);
		betterTempCheck(149.9);
		betterTempCheck(150.0);
		betterTempCheck(150.1);
		betterTempCheck(198.0);
		betterTempCheck(202.0);
		betterTempCheck(222.0);
		betterTempCheck(266.0);
		
	}	
}
