package com.cts.conctes.model;

import java.util.Date;

public class ConstructionProject {

	String projectId;
	Date plannedDOStart;
	String typeOfProject;
	String structure;
	double areaInSqFt;
	double estimatedCostInlac;
	double estimatedTimeInMonths;
	
	
	public ConstructionProject() {
		super();
	}

	public ConstructionProject(String projectId, Date plannedDOStart, String typeOfProject, String structure,
			double areaInSqFt, double estimatedCostInlac, double estimatedTimeInMonths) {
		super();
		this.projectId = projectId;
		this.plannedDOStart = plannedDOStart;
		this.typeOfProject = typeOfProject;
		this.structure = structure;
		this.areaInSqFt = areaInSqFt;
		this.estimatedCostInlac = estimatedCostInlac;
		this.estimatedTimeInMonths = estimatedTimeInMonths;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Date getPlannedDOStart() {
		return plannedDOStart;
	}

	public void setPlannedDOStart(Date plannedDOStart) {
		this.plannedDOStart = plannedDOStart;
	}

	public String getTypeOfProject() {
		return typeOfProject;
	}

	public void setTypeOfProject(String typeOfProject) {
		this.typeOfProject = typeOfProject;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public double getAreaInSqFt() {
		return areaInSqFt;
	}

	public void setAreaInSqFt(double areaInSqFt) {
		this.areaInSqFt = areaInSqFt;
	}

	public double getEstimatedCostInlac() {
		return estimatedCostInlac;
	}

	public void setEstimatedCostInlac(double estimatedCostInlac) {
		this.estimatedCostInlac = estimatedCostInlac;
	}

	public double getEstimatedTimeInMonths() {
		return estimatedTimeInMonths;
	}

	public void setEstimatedTimeInMonths(double estimatedTimeInMonths) {
		this.estimatedTimeInMonths = estimatedTimeInMonths;
	}

	@Override
	public String toString() {
		return "ConstructionProject [projectId=" + projectId + ", plannedDOStart=" + plannedDOStart + ", typeOfProject="
				+ typeOfProject + ", structure=" + structure + ", areaInSqFt=" + areaInSqFt + ", estimatedCostInlac="
				+ estimatedCostInlac + ", estimatedTimeInMonths=" + estimatedTimeInMonths + "]";
	}

	
	
	
	
	
}
