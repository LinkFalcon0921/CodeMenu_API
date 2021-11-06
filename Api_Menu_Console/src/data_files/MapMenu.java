package data_files;

import java.util.*;

public class MapMenu {
	Map<NodeMenu,Set<NodeMenu>>	list;
	
	//Crear logica Crud;
	//Revisar los valores de  errores 
	//Crear clases Exception
	
	public MapMenu() {
		list = new LinkedHashMap<NodeMenu, Set<NodeMenu>>();
	}
		
	/*
	 * Permite agregar un sub menu adicional dentro de un menu hijo.
	 * 
	 * Si este padre no existe no realizada nada.
	 * */
	public boolean addSubMenu(String point,String name,String menu) {
		//Parametros : UBICACION DEL MENU, NOMBRE DEL MENU, MUESTRA DEL MENU, CONTENIDO DEL MENU
	
		boolean u = false;
		NodeMenu men;
		try {
		
			men = new NodeMenu(name,menu);
			NodeMenu ned = get(point);
			
			if(ned!=null)
				u = list.get(ned).add(men);
	
			
		}catch (NullPointerException e) {
			u = false;
			//Editar Clase errores.
		}
		return u;
	}
	
	/*
	 * Permite agregar un padre menu con menus vacios.*/
	public boolean addMenu(String name,String menu) {
		
		boolean u = false;
		
		try {
			NodeMenu men = new NodeMenu(name,menu);	
			Set<NodeMenu> lest = new LinkedHashSet<NodeMenu>() ;
			u = list.put(men, lest).equals(null);
			
			
		}catch(NullPointerException y) {
			u = false;
			//Editar Clase errores.
		}
		
		return u;
	}
	/*
	 * Permite remueve un padre con todos los menus hijos.*/
	public boolean RemoveMenu(String name) {
		
		boolean u = false;
		try {
		
		NodeMenu ned = get(name);
		
		if(ned!=null) 
			u = !list.remove(ned).equals(null);
		
			
		}catch(NullPointerException e) {
			u = false;
		}
		
		return u;
	}
	
	/*
	 * Limpia el menu padre y elimina a los hijos que contiene.*/
	public boolean ClearSubMenu(String name) {
		
		boolean u = false;
		
		try {
		
			NodeMenu ned = get(name);
			
			if(ned!=null) {
				list.get(ned).clear();
				u = true;
			}
		
			
		}catch(NullPointerException e) {
			u = false;
		}
		
		return u;
	}
	
	
	/*
	 * Busca el menu padre.*/
	private NodeMenu get(String point) {
		
		for(NodeMenu p : list.keySet()) {
			
			if(p.toString().equals(point)) {
				return p;
			}
		}
		return null;
		
		//SLOWER 13%
		//return list.keySet().stream().filter(o -> o.toString().equals(point)).findFirst().get();
	}
	
}
