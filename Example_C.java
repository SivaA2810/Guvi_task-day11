package javaTask_E_day12;

public class Example_C {

// Write the code of ArrayIndexOutOfBoundsException & StringIndexOutOfBoundsException?
	
	
public void arrayindexoutofbounds_exception() {
		int [] array = new int[3];
		array[0]=100;
		array[1]=100;
		array[2]=100;

		try{
			int wrong_index=array[5];
			System.out.println(wrong_index);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("ArrayIndexOutOfBoundsException - you enter the index out of bounds number");
		}
	}
public void stringindexoutofbounds_exception(){
		String name = "sivakuamr_A";
		
		try{
			System.out.println(name.length());
			System.out.println(name.charAt(12));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException - you ener the index out of bound from the given string");
		}
		



	}

	
	
	
	public static void main(String[] args) {
		Example_C ec = new Example_C();
		ec.arrayindexoutofbounds_exception();
		ec.stringindexoutofbounds_exception();

	}

}
