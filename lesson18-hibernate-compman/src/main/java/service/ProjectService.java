package service;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.ProjectDao;
import dto.ProjectDto;
import dto.ProjectDtoRawData;
import persistence.Project;

public class ProjectService {
	private static ProjectDao projectDao;
	
	static {
		projectDao = new ProjectDao();
	}
	
	public List<Project> getProjects(double budget) {
		return projectDao.getProjects(budget);
	}
	
	public List<ProjectDto> getProBudgets() {
		List<ProjectDto> result = new ArrayList<ProjectDto>();
		List<ProjectDtoRawData> rawData = projectDao.getProBudgets();
		Map<String, List<ProjectDtoRawData>> dataMap = rawData.stream().collect(Collectors.groupingBy(ProjectDtoRawData::getDeptName));
		
		for (Entry<String, List<ProjectDtoRawData>> entry : dataMap.entrySet()) {
			List<SimpleEntry<String, Double>> proBuds = entry.getValue().stream()
					.map(rawItem -> new SimpleEntry<String, Double>(rawItem.getProName(), rawItem.getBudget()))
					.collect(Collectors.toList());
			
			Double budget = entry.getValue().stream()
					.mapToDouble(ProjectDtoRawData::getBudget)
					.sum();
			
			result.add(new ProjectDto(entry.getKey(), proBuds, budget));
		}
		
		return result;
	}
}
