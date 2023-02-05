package userdefined;

public class Shaadidotcom {

	static void submit() throws ShaadiException
	{
		int age=17;
		if(age>21)
			
		{
			System.out.println("hello");
			
		}
		else
		{
			throw new ShaadiException("invalid age");
			
		}
			
	}
		public static void main(String[] args) {
			{
				try
				{
					submit();
					
				}
		       catch(ShaadiException e)
				{
		    	   System.out.println(e.getMessage());
		    	   
				}
			
			}
		}
	}

class ShaadiException extends Exception
{
	String msg;
	ShaadiException(String msg)
	{
		this.msg=msg;
	
	}
	public String getMessage()
	{
		return msg;
	}
}
