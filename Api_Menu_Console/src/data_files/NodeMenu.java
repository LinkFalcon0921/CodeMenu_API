package data_files;

public class NodeMenu {

	private static int co;
	
	private String menu;
	private String ind = "";
	
	public NodeMenu(String indicate) {
		ind = (indicate == null) ? String.format("Defailt%s", ++co): indicate;
	}
	
	public NodeMenu(String indicate,String main) {
		this(indicate);
		setContent(main);
	}
	
	//SETTERS - GETTERS
	
	public void setContent(String content) {
		menu = content;
	}
	
	//PUBLIC METHODS CLASS
	
	
	
	public void replace(String seq) {
		if(!menu.toString().equals(seq))
			menu = seq;
	}
	
	@Override 
	public String toString() {
		return ind;
	}
	
}
