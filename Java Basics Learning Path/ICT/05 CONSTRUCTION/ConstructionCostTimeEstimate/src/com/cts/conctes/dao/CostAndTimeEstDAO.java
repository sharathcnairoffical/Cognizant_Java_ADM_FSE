package com.cts.conctes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.cts.conctes.exception.ConstructionEstimationException;
import com.cts.conctes.model.ConstructionProject;
import com.cts.conctes.util.ApplicationUtil;



public class CostAndTimeEstDAO {

	public static Connection connection = null;

	public boolean insertConstructionProject(ArrayList <ConstructionProject> constProjects) throws ConstructionEstimationException {
		boolean recordsAdded = false;
		
		//WRITE YOUR CODE HERE

		return recordsAdded;
	}
	public ArrayList <ConstructionProject> getConstructionProjectsData()
	{
		ArrayList <ConstructionProject> consApplicants = new ArrayList<ConstructionProject>();
		
		//WRITE YOUR CODE HERE
		
		return consApplicants;
	}
	
}
