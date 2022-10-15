/*sting methods implementation
 * @006_Akash_Kadbhane_JH
 * 
 * */
public class StringMethodes {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "akash";
		String s2 = "akash";
		String s3="AkasH";
		String s4 = new String("akash");
		String s5 = new String("akash");
		String s6 = "akash kailas kadbhane";
		System.out.println(s1==s2);//true string constant pool 
		System.out.println(s1==s3);//false == is case sensitive
		System.out.println(s1==s4);//false compare reference from string constant pool to heap   
		System.out.println(s4==s5);//false compare reference not the content of it
		System.out.println(s1.equals(s2));//true compare content
		System.out.println(s1.equals(s3));//false case sensitive
		System.out.println(s1.equals(s4));//true compare content
		System.out.println(s4.equals(s5));//true compare content
		System.out.println(s1.charAt(3));//returns character at index 3
		System.out.println(s1.equalsIgnoreCase(s3));//true it ignore case
		byte [] arr = s3.getBytes();// converts string into byte array i.e replace char at index with ascii value 
		System.out.print("{");
		for (int x : arr) {
			System.out.print(x+",");
		}
		System.out.print("}");
		System.out.println();
		System.out.println(s6.startsWith(s1));//true check for start (prefix)
		System.out.println(s6.startsWith("akash"));//true check for start (prefix)
		System.out.println(s6.endsWith("kadbhane"));//true check for end (suffix)
		System.out.println(s6.endsWith("ane"));//true ("e")also true
		System.out.println(s3.compareTo(s4));//-32 case sensitive returns difference between ascii value here a-A is done 
		String s7 = new String("1234akash kadbhane akash");
		String s8 ="";
		System.out.println(s7.indexOf('1'));//0 gives back index
		System.out.println(s7.indexOf('k'));//5 gives back index
		System.out.println(s7.lastIndexOf('a'));//6 last occurrence of that char
		System.out.println(s7.indexOf(s1));// 4 it return s1="akash" index
		System.out.println(s7.indexOf(s1,12));//19 Search for s1 beyond given index
		System.out.println(s7.contains(s1));// true
		System.out.println(s7.concat("kailas"));//1234akash kadbhane akashkailas  join given string to exsisting string
		System.out.println(String.join("-","a","k","a","s","h")); //a-k-a-s-h
		System.out.println(s8.isEmpty());//true
		String s9 ="a-k-a-s-h";
		String [] arr1 = s9.split("-");
		for (String x: arr1) {
			System.out.print(x);// akash  it delete "-"
		}
		System.out.println();
		String [] arr2 = s9.split("-",2);//k-a-s-h delete "-" up to limit "2"//at limit "3" aka-s-h
		for(String x :arr2) {
			System.out.print(x);
		}
		System.out.println();
		System.out.println(s1.length());//5 gives length
		System.out.println(s7.length());//24 gives length
		String s10 = "ILoveJava";
		System.out.println(s10.substring(2));// oveJava print from the index
		System.out.println(s10.substring(2, 5));//ove  include start index
		System.out.println(s3.toLowerCase());//akash
		System.out.println(s1.toUpperCase());//AKASH
		System.out.println(s10.replace('v', 'V'));//ILoVeJaVa
		String s11 = "akash akash akash";
		System.out.println(s11.replaceFirst("a", "A"));//Akash akash akash
		System.out.println(s11.replace("ak", "ab"));//abash abash abash

		System.out.println();

	}


}
