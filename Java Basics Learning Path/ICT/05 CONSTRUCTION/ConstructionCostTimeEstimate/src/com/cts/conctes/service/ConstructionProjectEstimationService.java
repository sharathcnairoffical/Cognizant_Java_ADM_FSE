package com.cts.conctes.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.conctes.dao.CostAndTimeEstDAO;
import com.cts.conctes.exception.ConstructionEstimationException;
import com.cts.conctes.model.ConstructionProject;
import com.cts.conctes.util.ApplicationUtil;


public class ConstructionProjectEstimationService {
	
	public static ArrayList <ConstructionProject> buildConstructionProjectList(List <String> consProjectRecords) {
	
	
		
		final String COMMADELIMITER = ",";
		ArrayList <ConstructionProject> consProjectRecordList = new ArrayList<ConstructionProject>();
		
		//WRITE YOUR CODE HERE
		
		return consProjectRecordList;
	}
	
	public boolean addConstructionProjectDetails(String inputFeed) throws ConstructionEstimationException {
		
		//WRITE YOUR CODE HERE
	 return false;
	}

	public static double[] estimateTimeAndCostForConstruction(String projectType,String structure,double areaInSqFt)
	{
		
		double costEstimateInRs=0.0,timeEstimateInMonths=0.0;
		double costs[] = {costEstimateInRs,timeEstimateInMonths};
		/*
		 * The Cost Estimate and 
		 * 
		Based on the type of the Project & the Structure , according to the required 
		area of Construction, the cost & time have to be calculated based on the base 
		data available in the table provided in the use case document:
		For eg. If the Project Type is “Commercial”  and the structure 
		is “Shopping Complex” the cost incurred for the construction of 
		per sq. ft is Rs.2600 and the time taken for the construction of 
		the 1000 sq ft of the same project  is 0.23 Months, 
		calculation has to be performed on the similar basis 
		i.e Pro rata basis depending upon the type and the area of construction. 

		 */
		
		//WRITE YOUR CODE HERE
		
		return costs;
		
	}
	

}
