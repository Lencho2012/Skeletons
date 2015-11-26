import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class subnetmask
{
	public static void main(String[] args)
	{
		maskToBin("255.255.248.0");
	}


	public final int[] powers = {128, 64, 32, 16, 8, 4, 2, 1};	//Powers of 2

	public int prefix(int[] binMask) //Calculating the prefix (netmask) length
	{
		
		return 1;
	}

	public static int[] maskToBin(String mask)	//Turning the Netmask into binary
	{
		int[] binaryCon = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //A single octet
		
		ArrayList<Integer> octEnd = new ArrayList<Integer>();
		
		ArrayList<String> finalBin = {0};		

		for(int i = 0; i < mask.length(); i++) //Finding octet ends
		{
			char maskChar = mask.charAt(i);
			if(maskChar == '.')
				octEnd.add(i);
				 
		}
		
		// Octets seperated into different strings
		String firstOct = mask.substring(0, octEnd.get(0));
		int first = Integer.parseInt(firstOct);
		System.out.println(firstOct + " or " + first);

		String secondOct = mask.substring(octEnd.get(0) + 1, octEnd.get(1));
		System.out.println(secondOct); 
		int second = Integer.parseInt(secondOct);
		
		String thirdOct = mask.substring(octEnd.get(1) + 1, octEnd.get(2));
		System.out.println(thirdOct);
		int third = Integer.parseInt(thirdOct);

		String fourthOct = mask.substring(octEnd.get(2) + 1);
		System.out.println(fourthOct);
		int fourth = Integer.parseInt(fourthOct);

		//Put in a recursive method for octet binary conversion
		for(int i = 7; i < binaryCon.length; i--)
		{
						
		}

		return finalBin;
	}


	//Working on the recursive method
	/*
	public static ArrayList<String> binary(int i, int oct, ArrayList<String> octBin)
	{
		for(i ; i < powers.length; i++)
		{
			if(oct >= powers[i])
			{
				octBin.add("1");
				return binary(oct - po
			}
				
		}	
	}
*/

	public static void Test()
	{
		System.out.println("Enter the address prefix length.");	
		System.out.println("Please use the CIDR notation. I.E. XXX.XXX.XXX.XXX/XX");
		
		Scanner input = new Scanner(System.in);
		String IP = input.nextLine();
		
		int prefix = 0;
		String sub = "";

		int oct1 = 0;
		String first = "";
		
		int oct2 = 0;
		String second = "";
		
		int oct3 = 0;
		String third = "";
		
		int oct4 = 0;
		String fourth = "";
		
		int sep  = 1;
	}
		/*
		for(int i = 0; i < IP.length() - 1; i++)
		{
			System.out.println(i);
			char abc = IP.charAt(i);
			if(abc == '.' && sep == 1)
			{
				sep++;
				oct1 = i; 
			}

			if(abc == '.' && sep == 2)
			{
				sep++;
				oct2 = i;
			}

			if(abc == '.' && sep == 3)
			{
				sep++;
				oct3 = i;
			}

			if(abc == '/' && sep == 4)
			{
				oct4 = i;
				break;
			}

			System.out.println("Seperator " + sep);
		}

		first 	= IP.substring(0, oct1);
		second	= IP.substring(oct1 + 1, oct2);
		third 	= IP.substring(oct2 + 1, oct3);
		fourth	= IP.substring(oct3 + 1, oct4);

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);

		for(int i = 0; i < IP.length() - 1; i++)
		{
			char abc = IP.charAt(i);
			if(abc == '/')
				sub = IP.substring(i+1);
		}

		prefix = Integer.parseInt(sub);

		System.out.println(prefix);

		*/

	
}
