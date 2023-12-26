package package04_1;

public class Main {

	public static void main(String[] args) {
		

	
		        String a = "sebine";
		        StringBuilder stringBuilder = new StringBuilder();
		        stringBuilder.append(a);
		        Main main = new Main();
		        main.customReverse(stringBuilder);



		}
		public void customReverse(StringBuilder stringBuilderr){
		        String str = stringBuilderr.toString();
		        String copy = "";
		        for(int i = str.length()-1;i>=0;i--){
		            copy += str.charAt(i);

		        }
		        System.out.println(copy);

		


		
	}

}
