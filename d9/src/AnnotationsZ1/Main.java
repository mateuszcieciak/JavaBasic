package AnnotationsZ1;

import java.lang.reflect.*;

public class Main {

	@Mateusz(to="Mateusz")
	public int add(){
		return 5;		//to jest cokolwiek, bo nic nie robi!
	}
	
	
	public static void main(String[] args)throws Exception{
		Main m = new Main();
		m.locate();
		
	}
	
		
		public void locate() throws Exception{
			Class c=getClass();
			Method m = c.getMethod("add");
			Mateusz annotation = m.getAnnotation(Mateusz.class);
			System.out.println(annotation.to());
		}
		

	}


