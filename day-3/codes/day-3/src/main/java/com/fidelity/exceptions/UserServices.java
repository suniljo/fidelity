package com.fidelity.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class UserServices {
	public String getUserNameById(int id) throws IOException, SQLException 
	{
		if(id == 100)
			return "Sanjay";
		return "Guest";
	}
}
