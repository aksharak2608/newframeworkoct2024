package day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date=Calendar.getInstance().getTime();
System.out.println(date);
DateFormat df= new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");

	String sdat= df.format(date);
	System.out.println(sdat);
	System.out.println(System.getProperty("user.dir"));
	


	}

}
