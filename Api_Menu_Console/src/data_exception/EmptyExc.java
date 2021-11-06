package data_exception;

public class EmptyExc extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmptyExc(String meg) {
		print(meg);
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public void getIssue(String[] val) {
		for(int y = 0 ; y< val.length;y++) {
			if(val[y] == null) {
				val[y] = new String("a");
				print(val[y].getClass().getName().concat(" no concide con "));
			}
		}
	}
	

}
