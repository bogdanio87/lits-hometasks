package HomeTask1;

import java.util.ArrayList;
import java.util.List;


public class Task1 {
	public static void main(String[] args) {

	    List<String> list = new ArrayList<String>();

	    list.add( "Barcelona" );
	    list.add( "Chelsea" );
	    list.add( "Bayern" );
	    list.add( "Real" );

	    list.add( 2, "Roma" ); 
	    list.add(1,"Roma");
	    list.add(3,"Roma");

	    System.out.println(list);
	}
}

