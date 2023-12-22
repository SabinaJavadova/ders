package package04_1;

import java.util.Arrays;

public class stringpool {

	public static void main(String[] args) {

		
/////////LENGTH///////	 
		String age = "1234";
		int length =age.length();
		System.out.println(length);
		
		
/////////CONCAT//////
		
	   String name = "Sabina";
	   String surname = " Javadova";
	   String concat = name.concat(surname);
	   
	   System.out.println(concat);
	   
/////////COPYVALUEOF/////
	   
	   char[] chars = {'J','a','v','a'};
	   String word = String.copyValueOf(chars);
	   
	   
	   System.out.println(word);
	   
/////////CHARAT////////
	   String sentence = "My name is Sabina";
	   char sentences = sentence.charAt(0);
	   System.out.println(sentences);
///////////ENDWITH/////
	   
	   String soz = "Information Technology";
	   System.out.println(soz.endsWith("gy"));
	   
///////EQUALS//////
	   
	   String setir1 = new String("Summer");
	   String setir2 = "summer";
	   System.out.println(setir1.equals(setir2));
////GETCHARS/////
	   String soz1 = "Black";
	   char[] chars1 = {'s','n','w','e','e','n'};
	   soz1.getChars(1, 4, chars1, 0);
	   
	   System.out.println (chars1);
/////INDEXOF////////
	   String sentence1 = "Anderson don't talk loudly,you're lowering the IQ level of the room.";
	   String s1 = "IQ";
	   System.out.println(sentence1.indexOf(s1));

	   
///////MATCHES//////
	   
	   String name1 = "Sherlock";
	   String name2 = "Anderson";
	   System.out.println(name1.matches(name2));
	   
	   
//////TOCHARARRAY//////
	   String soz11 = "Java";
	   char[] charArray = soz11.toCharArray();
	   System.out.println(charArray);
	   
//////compareTo/////
	   String herf = "s";
	   System.out.println(herf.compareTo("m"));
	   
////isblankisempty////
	   String bosh = "  ";
	   System.out.println(bosh.isBlank());
	   System.out.println(bosh.isEmpty());
	   
/////replace////
	   String word1 = "Sebine";
	   String word12 = word1.replace('e','a');
	   System.out.println(word12);
	   
	   
/////split////
	   String a1 = "Developia";
	   String[] a1Array = a1.split("e");
	   System.out.println(Arrays.toString(a1Array));
	   
	   
/////startsWith////
	   String soz5 = "Chase Atlantic";
	   System.out.println(soz5.startsWith("Ch"));
	   
	
	   
//////substring/////
	   String wordd = "Tom Ford";
	   String f1 = wordd.substring(3);
	   System.out.println(f1);
	   
/////ToLowerCase,uppercase////
	   
	   String lower = "BornToDie";
	   String upper = "SaintLauren";
	   System.out.println(lower.toLowerCase());
	   System.out.println(upper.toUpperCase());
	   
/////contains//////
	   String singer = "Sezen Aksu";
	   
	   System.out.println(singer.contains("Aksu"));
	   
	   
/////trim////
	   
	   String t1 = "   IronMan:    ";
	   
	   String t2 = "I Love you 3000";
	   
	   System.out.println(t1.trim() + t2);
	   

	   
	  
	   
	   
	   
	}

}
