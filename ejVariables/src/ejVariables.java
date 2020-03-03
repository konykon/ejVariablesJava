
public class ejVariables {

	public static void main(String[] args) {
		
		//Fase 1
		String name = "Juan";
		String surnameOne = "Perez";
		String surnameTwo = "Gonzalez";
		
		int day = 27;
		int month = 2;
		int year =2020;
		
		System.out.println(name + " " + surnameOne + " " + surnameTwo);
		System.out.println(day + "/" + month + "/" + year);
		
		
		//Fase 2
		final int initialLeapYear = 1948;
		int leapYearFreq = 4;
		final int bday = 1979;
		int count = 0;
		for (int i = initialLeapYear + 1; i <= bday; i++) {
			if (i % leapYearFreq == 0){
			count++;
			}
		}
		System.out.println(count);
		
		
		//Fase 3
		int leapYear = 1948;
		boolean leap = false;
		for (int i = leapYear + 1; i <= bday; i++) {
			leapYear = i;
			if (i % leapYearFreq == 0){
				leap = true;
			} else {
				leap = false;
			}
			if (leap) {
				String positive = leapYear + " is a leap year";
				System.out.println(positive);
			} else {
				String negative = leapYear + " isn't a leap year";
				System.out.println(negative);
			}
		}
		
		
		//Fase 4
		String nameSurname = "Juan Perez Gonzalez";
		String birthDate = "01/01/1979";
		String birthDateLeapYear = "";
		if (bday % leapYearFreq == 0) {
			leap = true;
		} else {
			leap = false;
		}
		if (leap) {
			birthDateLeapYear = "My birthdate is on a leap year";
		} else {
			birthDateLeapYear = "My birthdate is not on a leap year";
		}
		
		System.out.println("My name is " + nameSurname);
		System.out.println("My birth date is " + birthDate);
		System.out.println(birthDateLeapYear);
	}

}

	