package es.unileon.prg1.pdate;

public class pDatePrincipal {
	public static void main(String[] args ) throws DateException {
		Date myFecha= new Date();
		Date myFecha2= new Date(30,10,2019);
		
		
		Date error;
		try {
			 error = new Date(99, 14, 2017);
			System.out.println(error.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(myFecha);
			System.out.println(myFecha2);
			
			if(myFecha.isSameYear(myFecha2)) {
				System.out.println("Las fechas tienen el mismo año.");
			}
			else {
				System.out.println("Las fechas tienen diferente año.");
			}
			
			if(myFecha.isSameMonth(myFecha2)) {
				System.out.println("Las fechas tienen el mismo mes.");
			}
			else {
				System.out.println("Las fechas tienen diferente mes.");
			}
			if(myFecha.isSameDay(myFecha2)) {
				System.out.println("Las fechas introducidas tienen el mismo dia.");
			}
			else {
				System.out.println("Las fechas introducidas tienen diferente dia.");
			}
			if(myFecha.isSame(myFecha2)) {
				System.out.println("Las fechas introducidas son iguales.");
			}
			else {
				System.out.println("Las fechas introducidas son diferentes.");
			}
			
		}
			

	}

	private static String getMonthName(String month1) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
		

}
