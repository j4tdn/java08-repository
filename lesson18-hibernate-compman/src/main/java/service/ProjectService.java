package service;

import java.util.List;

import dao.HibernateProjectDao;
import dao.ProjectDao;
import persistence.Project;
import persistence.ProjectInfo;

public class ProjectService {
	private static ProjectDao projectDao;
	static {
		projectDao = new HibernateProjectDao();
	}

	public List<Project> get(Double budget) {
		return projectDao.get(budget);
	}
	
	public List<ProjectInfo> getTotalOfBudget(Integer year) {
		return projectDao.getTotalOfBudget(year);
	}

	public Project getHighestBudget(Integer year) {
		return projectDao.getHighestBudget(year);
	}
}
