//Write recursive program to reverse a string
//Write recursive program to reverse a sentence


class Reverse{
	public static void reverseString(String s){
		
		if (s == null || s.length()<=1)
			System.out.println(s);
		else{
			System.out.print(s.charAt(s.length()-1));
			reverseString(s.substring(0,s.length()-1));
		}
	}
	public static void main(String [] args){
		String s1 = "ReverseString";
		String s2 = "Reverse the String Using Recursion";
		reverseString(s1);
		reverseString(s2);
	}
}
/* 
gnirtSesreveR
noisruceR gnisU gnirtS eht esreveR */