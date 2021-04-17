package dao;

import java.util.List;

import persistence.Project;
import persistence.ProjectDtoRawData;

public interface ProjectDao {
	List<Project> get(Double budget);	
	List<ProjectDtoRawData> getTotalOfBudget(Integer year);	
	Project getHighestBudget(Integer year);
}
