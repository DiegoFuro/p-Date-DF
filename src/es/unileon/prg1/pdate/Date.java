package es.unileon.prg1.pdate;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	//Constructor de la clase Date
	
	public Date() {
		this.day=1;
		this.month=1;
		this.year=1;
	}
	public Date(int day, int month, int year) throws DateException {
		if((day>0)&&(day<32)) {
			this.day=day;
		}
		else {
			throw new DateException("Error en el dia introducido.");
		}
		this.day=day;
		this.month= month;
		this.year= year;
	}
	public boolean isSameYear(Date miFecha) {
		boolean retorno= false;
		
		if(this.year==miFecha.year) {
			retorno=true;
		}
			
		return retorno;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//Metodos isSameYear, isSameMonth, isSameDay
	public boolean isSameYear(int year) {
		if(this.year==year) {
			return true;
			
		}
		else {
			return false;
		}
	}
	public boolean isSameMonth(int month) {
		if(this.month==month) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSameDay(int day) {
		if(this.day==day) {
			return true;
		}
		else {
			return false;
		}
	}
	//Metodo isSame
	
	public boolean isSame(int day, int month, int year) {
		if(this.day==day && this.month==month && this.year==year) {
			return true;
		}
		else {
			return false;
		}
	}
	//Metodos isSame sin usar if
	
	public boolean isSameYearWithoutIf(int year) {
		return this.year==year;
	}
	public boolean isSameMonthWithoutIf(int month) {
		return this.month==month;
	}
	public boolean isSameDayWithoutIf(int day) {
		return this.day==day;
	}
	public boolean isSameWithoutIf(int day, int month, int year){
		return this.day==day && this.month==month && this.year==year;
	}
	
	//Metodo que devuelve el nombre de un mes
	
	public String getMonthName() {
		String monthName = null;
		switch(this.month) {
		case 1: monthName="Enero";
		break;
		case 2: monthName= "Febrero";
		break;
		case 3: monthName="Marzo";
		break;
		case 4: monthName= "Abril";
		break;
		case 5: monthName= "Mayo;";
		break;
		case 6: monthName="Junio";
		break;
		case 7: monthName="Julio";
		break;
		case 8: monthName="Agosto";
		break;
		case 9: monthName="Septiembre";
		break;
		case 10: monthName="Octubre";
		break;
		case 11: monthName="Noviembre";
		break;
		case 12: monthName="Diciembre";
		break;
		default: monthName="No existe el mes introducido";
		break;
		}
		return monthName;
		
	}
	
	//Metodo para imprimir el mes
	
	public void printMonth() {
		String month1= getMonthName();
		System.out.println("El mes introducido es: "+month1+".\n");
	}
	
	//Metodo que comprueba si el dia en ese mes es correcto.
	public int getDaysOfTheMonth(int month) {
		int numeroDias=0;
		switch(month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: numeroDias= 31;
				break;
		case 4:
		case 6:
		case 9:
		case 11: numeroDias=30;
				break;
		case 2:
				numeroDias= 28;
				break;
		default: numeroDias= -1;
		
	}
		return numeroDias;

	}
	public boolean dayRight(int day) {
		if((day>0)&& (day <= getDaysOfTheMonth(month))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String monthsLeft(int month) {
		StringBuffer cadena= new StringBuffer();
		for(int i=month+1; i<=12; i++) {
			cadena.append(getMonthName() + " ");
		}
		return cadena.toString();
	}
	public String printDate(int day, int month, int year) {
		String printDate=("Fecha: "+day+"/"+month+"/"+year);
		return printDate;
	}
	//Imprimir los dias que faltan de mes.
	
	public void printDateLeftOfMonth(int day, int month, int year) {
		StringBuffer Date= new StringBuffer();
		Date.append("Quedan las siguientes fechas para que acabe el mes: \n");
		
		for(int i=day; i<=getDaysOfTheMonth(month); i++) {
			Date.append(printDate(i, month, year) +"\n");
		}
		System.out.println(Date.toString());
	}
	
	//Imprimir los meses con el mismo numero de dias que este mes
	
	public void printDatesWithSameDays(int month) {
		
		StringBuffer cadena= new StringBuffer();
		cadena.append("Los siguientes meses tienen el mismo numero de dias: \n");
		
		for(int i=1; i<=12; i++) {
			if (getDaysOfTheMonth(i)== getDaysOfTheMonth(month)) {
				cadena.append(getMonthName()+ " ");
			}
		}
		System.out.println(cadena.toString());
	}
	//Contar el numero de dias desde el primer dia del año
	
	public int daysSinceFirstOfYear() {
		int daysSinceFirstOfYear=0;
		
		Date fecha3 = new Date(1,1, year);
		for(int i=1; i<this.month; i++) {
			daysSinceFirstOfYear += getDaysOfTheMonth(i);
			fecha3.setMonth(i+ 1);
		}
		daysSinceFirstOfYear= daysSinceFirstOfYear + this.day -1;
		return daysSinceFirstOfYear;
	}
	
	//Metodo  para contar el numero de intentos necesarios para generar una fecha aleatoria igual a la fecha dada
	
	public int numberOfAttemps() {
		int counts=0;
		int day=0;
		int month=0;
		int year=0;
		while(isSameWithoutIf(day, month, year)) {
			month=(int) (Math.random()*12)+1;
			day=(int)(Math.random()*this.getDaysOfTheMonth(month)) +1;
			year= this.year;
			counts++;
		}
		return counts;
	}
	
	public int numberOfAttemptsDoWhile() {
		int counts=0;
		int day=0;
		int month=0;
		int year=0;
		do {
			month=(int)(Math.random()*12)+1;
			day=(int)(Math.random()*this.getDaysOfTheMonth(month))+1;
			year=this.year;
			counts++;
		}while(isSameWithoutIf(day, month, year));
		return counts;
				
	}
	//Metodo para mostrar el dia de la semana de la fecha dada, sabiendo en que dia de la semana empezo el año.
	private String nameOftheDay(int day) {
	String semana;
	switch(day) {
	case 1: semana="Lunes";
	break;
	case 2: semana="Martes";
	break;
	case 3: semana="Miercoles";
	break;
	case 4: semana="Jueves";
	break;
	case 5: semana="Viernes";
	break;
	case 6: semana="Sabado";
	break;
	case 7: semana="Domingo";
	break;
	default: semana= "Has introducido un dia incorrecto.";

	}
	return semana;
	}
	
	public String dayOfWeek(int day) {
		int name;
		name= (daysSinceFirstOfYear()%7 + day)%7;
		return nameOftheDay(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
