package dao;

import java.util.List;

import persistence.Project;
import persistence.ProjectInfo;

public interface ProjectDao {
	List<Project> get(Double budget);	
	List<ProjectInfo> getTotalOfBudget(Integer year);	
	Project getHighestBudget(Integer year);
}
