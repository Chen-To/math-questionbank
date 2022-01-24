package ICS;

public class Hasher{
	
	public Hasher(){
		
	}
	
	public static long getHash(String str){
		long code = 7;
		final int prime = 131;
		for (int i = 0; i < str.length(); i ++){
			code = code * prime + str.charAt(i);
		}
		return code;
	}
	
}