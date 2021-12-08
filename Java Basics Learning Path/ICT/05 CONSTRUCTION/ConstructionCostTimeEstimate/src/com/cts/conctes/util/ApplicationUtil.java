package com.cts.conctes.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.cts.conctes.exception.ConstructionEstimationException;



public class ApplicationUtil {

	public static List<String> readFile(String inputfeed) throws ConstructionEstimationException {
		List<String> constructionProjects = new ArrayList<String>();
		
		//WRITE YOUR CODE HERE

		return constructionProjects;
	}
	public static java.sql.Date utilToSqlDateConverter(java.util.Date utDate) {
		java.sql.Date sqlDate = null;
		
		//WRITE YOUR CODE HERE
		
		return sqlDate;
	}
	
	public static java.util.Date stringToDateConverter(String stringDate) {
		Date strDate = new Date();
		
		//WRITE YOUR CODE HERE
		
		return strDate;
	}
	public static boolean checkIfCurrentFinYearProject(Date dos)
	{
		boolean flag = false;
		int givenYear,givenMonth;
		givenYear = (dos.getYear()+1900);
		givenMonth = dos.getMonth();
		Date curDate = new Date();
		int curYear,curMonth;
		curYear = (curDate.getYear()+1900);
		curMonth = curDate.getMonth();
		if( curYear == givenYear)
		{
			if(((curMonth >=0)&&(curMonth <= 2)) && ((givenMonth >=0)&&(givenMonth <= 2)))
			{
				flag = true;
			}
			else if(((curMonth >=3)&&(curMonth <= 11)) && ((givenMonth >=3)&&(givenMonth <= 11)))
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		else if(curYear > givenYear)
		{
			int dif = curYear - givenYear;
			if(dif == 1)
			{
				if(((curMonth >=0)&&(curMonth <= 2)) && ((givenMonth >=3)&&(givenMonth <= 11)))
				{
					flag = true;
				}
				else if(((curMonth >=3)&&(curMonth <= 11)) && ((givenMonth >=3)&&(givenMonth <= 11)))
				{
					flag = false;
				}
				else
				{
					flag = false;
				}
			}
			else
			{
				flag = false;
			}
		}
		else if(curYear < givenYear)
		{
			int dif =  givenYear-curYear;
			if(dif == 1)
			{
				if(((curMonth >=3)&&(curMonth <= 11)) && ((givenMonth >=0)&&(givenMonth <= 2)))
				{
					flag = true;
				}
				else if(((curMonth >=3)&&(curMonth <= 11)) && ((givenMonth >=3)&&(givenMonth <= 11)))
				{
					flag = false;
				}
				else
				{
					flag = false;
				}
			}
			else
			{
				flag = false;
			}
		}
		else
		{
			flag = false;
		}
		
		return flag;
		
	}
	

}
