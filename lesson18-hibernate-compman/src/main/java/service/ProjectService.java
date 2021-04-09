package service;

import java.util.List;

import dao.EmployeeDao;
import dao.ProjectDao;
import persistence.Employee;
import persistence.Project;

public class ProjectService {
	private static ProjectDao projectDao;

	public ProjectService() {
		projectDao = new ProjectDao();
	}

	public List<Project> getPros(Integer budget) {
		return projectDao.getPros(budget);
	}

}
