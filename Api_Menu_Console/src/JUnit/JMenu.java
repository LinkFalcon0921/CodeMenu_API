package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

import data_files.MapMenu;

class JMenu {

	@Test
	void test() {
		String ingo = "lang";
		
		MapMenu y = new MapMenu();
		
		Stack<String> i = new Stack<String>();
		
		for(int q = 9;q > -1 ; q--) {
			i.push(String.format(ingo+" %s", q));
		}
		
		 y.addMenu(i.pop(), i.pop());
		y.addMenu(i.pop(), i.pop());
		 y.addMenu(i.pop(), i.pop());
	
		assertEquals(true, y.addSubMenu("lang 0",null, i.pop()));
		
		
	}
	
	@Test
	void test1() {
		String ingo = "lang";
		
		MapMenu y = new MapMenu();
		
		Stack<String> i = new Stack<String>();
		
		for(int q = 9;q > -1 ; q--) {
			i.push(String.format(ingo+" %s", q));
		}
		
		y.addMenu(i.pop(), i.pop());
		
		
		assertEquals(true, y.addSubMenu("lang 0",null, i.pop()));
		
	}
	
	@Test
	void test2() {
		String ingo = "lang";
		
		MapMenu y = new MapMenu();
		
		Stack<String> i = new Stack<String>();
		
		for(int q = 9;q > -1 ; q--) {
			i.push(String.format(ingo+" %s", q));
		}
		
		y.addMenu(i.pop(), i.pop());
		
		assertEquals(true, y.ClearSubMenu(String.format(ingo+" %d", 0)));
		
		
	}
	
	@Test
	void test3() {
		String ingo = "lang";
		
		MapMenu y = new MapMenu();
		
		Stack<String> i = new Stack<String>();
		
		for(int q = 9;q > -1 ; q--) {
			i.push(String.format(ingo+" %s", q));
		}
		
		
		String a = i.pop();
		String b = i.pop();
		 y.addMenu(a, b);
				assertEquals(true, y.RemoveMenu(String.format(ingo+" %d", 0)));
		
		
	}

}

