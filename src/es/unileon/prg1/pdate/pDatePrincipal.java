package es.unileon.prg1.pdate;

public class pDatePrincipal {
	public static void main(String[] args ) throws DateException {
		Date myFecha= new Date();
		Date myFecha2= new Date(30,10,2019);
		
		if(myFecha.isSameYear(myFecha2)) {
			System.out.println("Es la misma fecha.");
		}
		else {
			System.out.println("No es la misma fecha.");
		}
		System.out.println(myFecha);
		Date today;
		
		try {
			today = new Date(99, 14, 2017);
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

	
	
	
		

}
