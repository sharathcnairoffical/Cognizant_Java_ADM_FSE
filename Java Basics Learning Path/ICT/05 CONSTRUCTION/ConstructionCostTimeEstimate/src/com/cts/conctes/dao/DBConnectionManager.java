package com.cts.conctes.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.conctes.exception.ConstructionEstimationException;



public class DBConnectionManager {

	 private static Connection con = null;
	 private static DBConnectionManager instance;
	
	public  DBConnectionManager()  throws ConstructionEstimationException
	{
		
		//WRITE YOUR CODE HERE
      //return con;
	}
	public static DBConnectionManager getInstance() throws ConstructionEstimationException 
	{
		
		//WRITE YOUR CODE HERE
		return instance;
	}
	public Connection getConnection() 
	{
		//WRITE YOUR CODE HERE
		return con;
	}
}
