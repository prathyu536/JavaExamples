
public class StringMethods {
	public static void main(String[] args){
		int a=10;
				String x = String.valueOf(a);
		String s = "prathyusha";
		String b = "   Prathyusha  ";
		String p = "my name is prathyusha";
		System.out.println(s.toUpperCase()); // Coverts string to uppercase 
		System.out.println(s.toLowerCase()); // converts string to lowercase
		System.out.println(s);				 // Same string will be written
		System.out.println(b.trim());		 // Removes white space front and end of the string
		System.out.println(s.startsWith("pr")); //checks whether the string s starts with "pr"
		System.out.println(b.endsWith("  "));	//checks whether the string ends with white spaces
		System.out.println(b.charAt(0)); 		//returns a character at specified index
		System.out.println(s.charAt(0));
		System.out.println(s.length());			//returns the length of the string
		System.out.println(s.replaceAll("a","z"));		//replaces all a with z
		System.out.println(b.replaceFirst("a", "x"));	//replace first a with x
		System.out.println(x+10);				//given type int,float into string
		System.out.println(s.contentEquals("Prathyusha"));	//
		System.out.println(s.contains("r"));		//checks whether the string contains r
		System.out.println(p.contains(" "));		//checks whether the string contains space
		System.out.println(s.compareTo("p")); //compares with string s and returns the number of remaining char
		System.out.println(s.compareTo("prathyusha Rdy"));
		System.out.println(s.concat(b));		//adds the string
		System.out.println(s.concat(" reddy"));
		System.out.println(s.isEmpty());
		System.out.println(s.substring(0,2));

		
		
		
	}

}
