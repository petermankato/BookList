/**
 * 
 */
//package application;

/**
 * @author Karissa Mouser
 * karissa.mouser@my.southcentral.ed
 * 
 *
 */
class OddEvenColumns {
	
	public static void main(String[] args) 
	{
		//%s    String
		//%f    float
		//%d    decimal/int
		//%c    char
		//%b    boolean
		//ref above
		System.out.printf("= = = = = = = = = = = = = = = = = \n");
		
		System.out.printf("%1s %16s", "Title","Author");
		System.out.printf("\n= = = = = = = = = = = = = = = = = \n");
		
		//boolean arrayList = false;
		String myBookArray[] = {"LOLITA","Vladimir Nabokov" ,
				                  "CATCH22" , "Joseph Heller" ,
				                  "Ulysses" , "James Joyce",
				                  "1984" , "George Orwell",
				                  "SCOOP" , "Evelyn Waugh"};
		//JTable table = new JTable(Object[] myBookArray , columnNames);

		// Loop through the array.
		// If even print title of book
		// Else print author of book
		for(int counter=0;counter<myBookArray.length;counter++)
		{
			/* You are using a ternery (which is an abbreviated if/else, as well as an if/else
          * Just do one or the other. In this case if/else is the most appropriate because
          * Each System.out is formatted differently.
          */
			//arrayList = (counter%2 != 1)?true:false;
         // Print title
			if(counter%2 != 1)
			{
				System.out.printf("%s", myBookArray[counter]);
			}
			else // Print Author
			{
				System.out.printf("\t\t\t%-30s\n", myBookArray[counter]);
			}
		}//end for

		// Add footnote
		System.out.printf("%1s", "\n\n*no specific order\nThis information was found at\nhttp://www.modernlibrary.com/top-100/100-best-novels/s");
		
	}
}
