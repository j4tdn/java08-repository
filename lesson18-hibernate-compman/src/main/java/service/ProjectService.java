package service;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.ProjectDao;
import persistence.Project;
import persistence.ProjectDTO;
import persistence.ProjectRawDto;

public class ProjectService {
	private static ProjectDao projectDao;
	static {
		projectDao = new ProjectDao();
	}
	public List<Project> getProjects (double budget) {
		return projectDao.getProjects(budget);
	}
	
	public List<ProjectDTO> getProBudgets() {
		List<ProjectDTO> result = new ArrayList<>();
		List<ProjectRawDto> rawData = projectDao.getProBudgets();
		Map<String, List<ProjectRawDto>> dataMap = rawData.stream().collect(Collectors.groupingBy(ProjectRawDto::getDeptName));
		for (Entry<String, List<ProjectRawDto>> entry : dataMap.entrySet()) {
			ProjectDTO project = new ProjectDTO();
			List<SimpleEntry<String, Double>> proBuds = entry.getValue().stream()
					.map(rawItem -> new SimpleEntry<String, Double>(rawItem.getProName(), rawItem.getBudget()))
					.collect(Collectors.toList());
			Double budget = entry.getValue().stream().mapToDouble(ProjectRawDto::getBudget).sum();
			result.add(new ProjectDTO(entry.getKey(), proBuds, budget));
			
		}
		return result;
	}

}
