package data_trees;

import data_extras_plus.MenuDefaults;

public class DefaulsFactory {
	
	public static MenuDefaults getDefault(int isApply) {
		switch(isApply) {
		case 1:
			return MenuDefaults.AGREGAR;
		case 2:
			return MenuDefaults.EDITAR;
		case 3:
			return MenuDefaults.MOSTRAR;
		case 4:
			return MenuDefaults.ELIMINAR;
		}
		
		return null;
	}
}
