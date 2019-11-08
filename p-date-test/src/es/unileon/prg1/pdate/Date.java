package es.unileon.prg1.pdate;

public class Date {
	
	int day;
	int month;
	int year;
	
	//Constructor vacio de la clase Date pasando 3 enteros
	
	public Date(int day, int month, int year) throws DateException {
		StringBuffer message= new StringBuffer();
		if (day<=0) {
			message.append("Dias negativos no validos. \n");
		}
		if (month<=0) {
			message.append("No se pueden introducir meses negativos \n");	
		}else {
			if(month>12) {
				message.append("No se pueden introducir mas de 12 meses\n");
			}else {
				if(day>this.daysOfMonth(month)) {
					message.append("Combinacion dia/mes incorrecto. Ejemplo del error: 30 de febrero\n");
				}
			}
		}
		if(year<0) {
			message.append("No se pueden introducir anios negativos. \n");
		}
		if(message.length()!=0) {
			throw new DateException(message.toString());
		}else {
			this.day=day;
			this.month=month;
			this.year=year;
		}
	}
	//Constructor vacio de la clase date pasando un Date
	public Date(Date today) {
		this.day=today.getDay();
		this.month=today.getMonth();
		this.year=today.getYear();
		
	}
	//Constructor predefinido de la clase Date
	public Date() {
		this.day=1;
		this.month=1;
		this.year=2017;
	}
	
	
	//setters y getters

	public int getDay() {
		return day;
	}
	public void setDay(int day) throws DateException {
		if(day<=0) {
			throw new DateException("No se pueden introducir dias negativos \n");
		}else {
			if(this.isDayRight(day)) {
				throw new DateException("Combinacion erronea mes/dia. \n");
			}else {
				this.day=day;
			}
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) throws DateException {
		if(month<=0) {
			throw new DateException("No se pueden introducir meses negativos \n");	
			}else {
				if(month>12) {
					throw new DateException("No se pueden introducir mas de 12 meses\n");
				}else {
					this.month=month;
				}
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) throws DateException{
		if(year<0) {
			throw new DateException("No se pueden introducir anios negativos \n");
		}else {
		this.year = year;
	}
}
	//Metodo que devuelve el dia siguiente.
	public Date tomorrow() {
		Date tomorrow =null;
		int d, m, y;
		d=this.day;
		m=this.month;
		y=this.year;
		
		d++;
		if(d>this.daysOfMonth(month)) {
			d=1;
			m++;
			if(m>12) {
				m=1;
				y++;
			}
		}
		try {
			tomorrow= new Date(d, m ,y);
		}catch (DateException e) {
			e.printStackTrace();
		}
		return tomorrow;
	}
	//Metodos isSameYear, isSameMonth, isSameDay con if
	
	public boolean isSameYear(int year) {
		if(this.year==year) {
			return true;
		}else {
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
	public boolean isSameDayWithIfStatement(int day){
		if(this.day==day) {
			return true;
		}
		else {
			return false;
		}
	}
	//Metodo isSame
	
	public boolean isSame(int day,int month, int year) {
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
	//Metodo isSameDay tomando como parametro una fecha
	public boolean isSameDay(Date other) {
		if (this.day==other.getDay())
			return true;
		else
			return false;
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
		String month= getMonthName();
		System.out.println("Mes actual: "+month+" .\n");
	}
	
	//Metodo que comprueba si el dia en ese mes es correcto.
	public int daysOfMonth(int month) {
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
	public boolean isDayRight(int day) {
		if((day>0)&& (day <= daysOfMonth(month))) {
			return true;
		}
		else {
			return false;
		}
	}
	//Metodo para imprimir la estacion del año del mes.
	public String getSeasonName() {
		String nameSeason=null;
		switch(month) {
		case 1:
		case 2:
		case 3: nameSeason="Invierno";
		break;
		case 4:
		case 5:
		case 6: nameSeason="Primavera";
		break;
		case 7:
		case 8:
		case 9: nameSeason="Verano";
		break;
		case 10:
		case 11:
		case 12: nameSeason="Otonio";
		break;
		default: nameSeason="Numero del mes no valido.";
		}
		return nameSeason;
	}
	//Metodo que imprime los meses que faltan de año.
	public String monthsLeft(int month) {
		StringBuffer cadena= new StringBuffer();
		for(int i=month+1; i<=12; i++) {
			cadena.append(getMonthName() + " ");
		}
		return cadena.toString();
	}
	//Metodo que imprime una fecha.
	public String printDate(int day, int month, int year) {
		String printDate=("Fecha: "+day+"/"+month+"/"+year);
		return printDate;
	}
	//Imprimir las fechas que faltan de mes.
	public String getDaysLeftOfMonth() {
		Date aux=tomorrow();
		StringBuffer daysLeft=new StringBuffer();
		try {
			for(int i=aux.getDay(); isDayRight(i); i++) {
				aux.setDay(i);
				daysLeft.append(aux.toString()+ " ");
			}
		}catch (DateException e) {
			System.err.println("Date.getDaysLeftOfMonth: "+ e.getMessage());
		}
		return daysLeft.toString();
	}
	
	
	
	//Imprimir los meses con el mismo numero de dias que este mes
	
	public void printDatesWithSameDays(int month) {
		
		StringBuffer cadena= new StringBuffer();
		cadena.append("Los siguientes meses tienen el mismo numero de dias: \n");
		
		for(int i=1; i<=12; i++) {
			if (daysOfMonth(i)== daysOfMonth(month)) {
				cadena.append(getMonthName()+ " ");
			}
		}
		System.out.println(cadena.toString());
	}
	//Contar el numero de dias desde el primer dia del año
	
	public int daysPast() throws DateException {
		int daysPast=0;
		
		Date miFecha3 =new Date(1,1, year);
		for(int i=1; i<month; i++) {
			daysPast += daysOfMonth(i);
			miFecha3.setMonth(i+ 1);
		}
		daysPast= daysPast + this.day -1;
		return daysPast;
	}
	
	//Metodo  para contar el numero de intentos necesarios para generar una fecha aleatoria igual a la fecha dada
	
	public int numberOfAttemps() {
		int counts=0;
		int day=0;
		int month=0;
		int year=0;
		while(isSameWithoutIf(day, month, year)) {
			month=(int) (Math.random()*12)+1;
			day=(int)(Math.random()*this.daysOfMonth(month)) +1;
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
			day=(int)(Math.random()*this.daysOfMonth(month))+1;
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
	
	public String dayOfWeek(int day) throws DateException {
		int name;
		name= (daysPast() %7 + day)%7;
		return nameOftheDay(name);
	}
	public String toString() {
		return this.day+ "/" + this.month + "/" + this.year;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
