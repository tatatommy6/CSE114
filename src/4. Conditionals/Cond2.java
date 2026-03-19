/* 
	Cond2.java
	Last modified by j.finn: 17-Mar-2026

	Conditionals with multiple branches.
 */

public class Cond2 
{
	/* 
		return absolute value of n
	 */
    public static int abs (int n) 
    {
        if (n >= 0)
            return n;
        else
            return -n;
    }

    /*
        Converts name of day to number day of week (1 to 7)
        Returns: day number of string or 0 if not a valid day name.
     */
    public static int encodeDay(String day) 
    {
        if (day.equals("Sunday"))
            return 1;
        else if (day.equals("Monday"))
            return 2;
        else if (day.equals("Tuesday"))
            return 3;
        else if (day.equals("Wednesday"))
            return 4;
        else if (day.equals("Thursday"))
            return 5;
        else if (day.equals("Friday"))
            return 6;
        else if (day.equals("Saturday"))
            return 7;
        else
            return 0;
    }

    /*
        An alternate indentation style is closer to
        Java syntax but is to be avoided because it
        wanders off the right margin of the page,
     */
    public static int encodeDay2(String day) 
    {
        if (day.equals("Sunday"))
            return 1;
        else 
            if (day.equals("Monday"))
                return 2;
            else 
                if (day.equals("Tuesday"))
                    return 3;
                else 
                    if (day.equals("Wednesday"))
                        return 4;
                    else 
                        if (day.equals("Thursday"))
                            return 5;
                        else 
                            if (day.equals("Friday"))
                                return 6;
                            else 
                                if (day.equals("Saturday"))
                                    return 7;
                                else
                                    return 0;
    }
    
    /*
        In a statement:
            if (test)
                statement
        If the test and the statement are short they may be placed on one line
     */
    public static int encodeDay3(String day) 
    {
        if (day.equals("Sunday")) return 1;
        else if (day.equals("Monday")) return 2;
        else if (day.equals("Tuesday")) return 3;
        else if (day.equals("Wednesday")) return 4;
        else if (day.equals("Thursday")) return 5;
        else if (day.equals("Friday")) return 6;
        else if (day.equals("Saturday")) return 7;
        else return 0;
    }

    /*
        If your tests are always checking a value against
        a list of integer or String constants, it may be
        simpler to use a switch statement

        This function converts the day number of the week to the day name.
        Returns: name of given day number or "" if invalid number

        Note: this function is also called encodeDay.
        We saw this in the Java math library.
        Two functions may have the same name if they can be
        distinguished by the type of their arguments.
        This is called function Overloading.    	
     */
    
    public static String encodeDay(int n) 
    {
        switch(n) 
        {
			case 1: return "Sunday";
			case 2: return "Monday";
			case 3: return "Tuesday";
			case 4: return "Wednesday";
			case 5: return "Thursday";
			case 6: return "Friday";
			case 7: return "Saturday";
			default: return "";
        }
    }
    
    /*
        In a switch statement, control passes to the matching case, or to
        default if no case matches. However, once a case matches and executes,
        the switch statement continues executing the subsequent cases in turn.
        To prevent this you use a break statement:

        switch(n) 
        {
			case 0:
				dosomething();
				break;
			case 1:
				dosomethingelse();
				break;
			case 2:
				dosomethingdontjuststandthere();
				break;
			...
			default: return "";
        }

		In our code for encodeDay, the function returns from
		the matching case, so the break statements are unnecessary.
	 */

    public static void main (String[] args) 
    {
        System.out.println("absolute value of " + 55 + " is " + abs(55));
        System.out.println("absolute of " + 0 + " is " + abs(0));
        System.out.println("absolute of " + -55 + " is " + abs(-55));

        System.out.println("Monday is encoded as " + encodeDay("Monday"));
        System.out.println("Friday is encoded as " + encodeDay("Friday"));
        System.out.println("Noday is encoded as " + encodeDay("Noday"));

        System.out.println("1 represents " + encodeDay(1));
        System.out.println("5 represents " + encodeDay(5));
    }
}

