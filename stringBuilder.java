package package04_1;

public class stringBuilder {

	
	

	public static void main(String[] args) {
	    String str = "salam";
		StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(str);
        System.out.println(sBuilder);
        
        sBuilder.insert(0, 2);
        System.out.println(sBuilder);
        
        sBuilder.replace(0, 3, str);
        System.out.println(sBuilder);
        
        sBuilder.delete(0, 3);
        System.out.println(sBuilder);
        
        sBuilder.reverse();
        System.out.println(sBuilder);
        
   
        System.out.println(sBuilder.capacity());
        
        System.out.println(sBuilder.charAt(3));
        
        System.out.println(sBuilder.length());
        
        System.out.println(sBuilder.substring(3));
       
        //////2////
        System.out.println("TAPSIRIQ 2:"
        		+ "");
        		 
        String str1="salam";
        String str2="sagol";
        String str3 ="necesen";
        
        StringBuilder sBuilder1 = new StringBuilder();
        
        sBuilder1.append(str1).append(str2).append(str3);
        
        System.out.println(sBuilder1);
        
        ////3//////
        System.out.println("TAPSIRIQ 3:"
        		+ "");
        
        String str4 = "Developia";
        StringBuilder sBuilder2 = new StringBuilder();
        sBuilder2.append(str4);
        sBuilder2.reverse();
        System.out.println(sBuilder2);
        
        


  
         	//////5/////
        System.out.println("TAPSIRIQ5:"
        		+ "");
     
        int int1 = Math.abs(-1234);
        System.out.println(int1);
       
        
        double int2 = Math.max(5, 7);
        System.out.println(int2);
        
        double int3= Math.round(3.4);
        System.out.println(int3);
        
        double int4 = Math.sqrt(36);
        System.out.println(int4);
        
        double int5 = Math.cbrt(27);
        System.out.println(int5);
        
        double int6 = Math.pow(2, 3);
        System.out.println(int6);
        
        double int7 = Math.ceil(3.4);
        System.out.println(int7);
        
        double int8 = Math.floor(3.4);
        System.out.println(int8);
        
        double int9 = Math.random();
        System.out.println(int9);
        
        double int10= Math.toDegrees(3.14/180);
        System.out.println(int10);
        
        double int11 = Math.toRadians(180);
        System.out.println(int11);
        
 
        
	}

}
