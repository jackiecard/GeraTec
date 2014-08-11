package Agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
	
	private Date data;
	private String dataString;
	
	public void converteData(String dataStr) {
		
		SimpleDateFormat dfIn = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dfOut = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			setData(dfIn.parse(dataStr));
			setDataString(dfOut.format(this.data));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}
	
	
}
