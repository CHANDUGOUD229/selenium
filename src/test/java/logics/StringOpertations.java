package logics;

import java.util.Set;

public class StringOpertations {

	String d = "CHIRRA CHANDRA shekhar GOUD";
	String wString = "CHIRRA CHANDRA SHEKHAR GOUD";

	public void getSubString()
	{

		String[] arr = d.split(" ");
		for (String c : arr) {
			System.out.println(c);
		}
	}

	public void comparesion() {
		if (d.equals(wString)) {
			System.out.println("same");
		} else if (d.compareTo(wString) == 0) {
			System.out.println("2 Same");
		} else if (d.compareToIgnoreCase(wString) == 0) {
			System.out.println("3 Same");
		}
	}

	public static void main(String[] args) 
	{
		
		String rString="nandu";
		
	
		StringBuilder stringBuilder=new StringBuilder(rString);
	System.out.println(	stringBuilder.reverse());
		int a[]= {1,3,5,456,776};
		System.out.println(a[2]);
		a[2]=500;
		System.out.println(a.length);
		for(int e:a)
		{
			System.out.println(e);
		}
		
		int []d=new int[5];
		d[0]=2;
		d[2]=5;
		d[1]=42;
		d[3]=52;
		d[4]=88;
		System.out.println(a.length);
		for(int r:d)
		{
			System.out.println(r);
		}
		
		
		String s = "Hello This is testing world";
		String s2 = "indian";
		System.out.println(s.length());
		System.out.println(s.charAt(8));
		System.out.println(s.trim().length());
		System.out.println(s.replace("a", "@"));
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.replace("chandra", "chandugoud"));
		System.out.println(s.length() - s.replace("i", "").length());

		// concordnate
		System.out.println(s + s2);

		System.out.println(s.concat(" ").concat(s2));
		// substring
		System.out.println(s.substring(5));
		System.out.println(s.substring(1, 12));
		// contains
		if (s.contains("harsha")) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		String fString = "Hello";
		String jString = "hello";

		if (fString.toUpperCase().substring(3).equals(jString.toUpperCase().substring(3))) {
			System.out.println("same thing");
		} else {
			System.out.println("not same");
		}

		String string = "Big black bug bit a big black dog on his big black nose";
		int count;

		// Converts the string into lowercase
		string = string.toLowerCase();

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++)
		{
			count = 1;
			for (int j = i + 1; j < words.length; j++) 
			{
				if (words[i].equals(words[j])) {
					count++;
					// Set words[j] to 0 to avoid printing visited word
					words[j] = "0";
				}
			}

			// Displays the duplicate word if count is greater than 1
			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);

		}
	}
}
