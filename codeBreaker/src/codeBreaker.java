public class codeBreaker {	 
	String key;
	 
	public codeBreaker(String number) {
		this.key = number;
	}
	
	public String adivinar(String numberToCompare) {
		String response ="";
		if(numberToCompare.length()!= 4) {
			return "Error de entrada";
		}			
		try {
			Integer.parseInt(numberToCompare);
			
		} catch(Exception e) {
			return "Error de entrada";
		}		
		
		for (int i =0; i< 4; i++) {
			for (int j =0; j< 4; j++) {
				if(numberToCompare.charAt(i)==key.charAt(j)) {
					if(i == j) {
						response+= "X";
					}else {
						response+= "_";
					}
				}
			}	
		}
		return response;
	}
}
