package data_trees;

import data_files.*;

public class OperNodes {
	private MapMenu menues;
	
	
	public OperNodes() {
		menues = new MapMenu();
	}
	
	public boolean addMenu(String node,String dato) {
		try{
			
			return menues.addMenu(node, dato);
			
		}catch(NullPointerException p) {
			return false;
		}
	}
	
	public boolean addSubMenu(String node, String name,String dato) {
		try{
			
			return menues.addSubMenu(node, name, dato);
			
		}catch(NullPointerException p) {
			return false;
		}
	}
	
	public boolean ClearSub(String node) {
		try{
			
			return menues.ClearSubMenu(node);
			
		}catch(NullPointerException p) {
			return false;
		}
	}
	
	public boolean remove(String node) {
		try{
			
			return menues.RemoveMenu(node);
			
		}catch(NullPointerException p) {
			return false;
		}
	}
	
}
