import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class subnetmask
{
	public static void main(String[] args)
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

		int[] powers = {128, 64, 32, 16, 8, 4, 2, 1};
		*/

	}
}
