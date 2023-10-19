
import java.rmi.*;
public class ClientRequest
{
	public static void main(String args[])
	{
		String answer; int[] value = new int[2];
		value[0] = Integer.parseInt(args[0]);
		value[1] = Integer.parseInt(args[1]);

		try
		{
			Search access =
				(Search)Naming.lookup("rmi://localhost:1900"+
									"/ds");
			answer = access.query(value);
			System.out.println("Addition: of " + args[0] + " and " + args[1] + " is " + answer);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}
}

