//Author:veera sivaji

/WAP to count the no. of palindrome words in a string
package que7;

public class Palindrome {
int count=0;
	
	private int countPalin(String str) {
	   
		for (int i = 0;i<str.length()-1;i++)
		{
	        char start = str.charAt(i); //returns the character of the specified string
	        String st = "";
	        st += start;
	        for (int j=i+1;j<str.length(); j++) {

	            st += str.charAt(j);		//returns the character of the string

	            StringBuffer rev = new StringBuffer(st).reverse();		//reversing the string 
	            if(st.equals(rev.toString())&&st.length()>1) {
	                System.out.println(st.toString());
	                count++;		//increasing the count
	            }
	        }

	        st = "";
	    }

	    System.out.println("Total Count : " + count);

	    return count;
	}

	public static void main(String[] args) {
		String a = "This is anudip java class";
	    Palindrome p= new Palindrome();
	    p.countPalin(a);
	    
	    
	    
	}


}

