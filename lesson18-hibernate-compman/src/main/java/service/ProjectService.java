package service;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.ProjectDao;
import dto.ProjectDto;
import dto.ProjectDtoRawData;
import persistence.Project;

public class ProjectService {
	private ProjectDao projectDao;

	public ProjectService() {
		projectDao = new ProjectDao();
	};

	public List<Project> getProjectGreaterThan(Integer budget) {
		return projectDao.getProjectGreaterThan(budget);
	}

	public List<ProjectDto> getProbudgets() {
		List<ProjectDtoRawData> rawData = projectDao.getProjectBudgets();

		var dataMap = rawData.stream().collect(Collectors.groupingBy(ProjectDtoRawData::getDepartmentName));
		
		var result = new ArrayList<ProjectDto>();
		
		for(Entry<String, List<ProjectDtoRawData>> entry: dataMap.entrySet()) {
			List<SimpleEntry<String, Integer>> proBuds = entry.getValue().stream()
					.map(rawItem -> new SimpleEntry<String, Integer>(rawItem.getProjectName(), rawItem.getBudget()))
					.collect(Collectors.toList());
			
			Integer budget = entry.getValue().stream()
					.mapToInt(ProjectDtoRawData::getBudget).sum();
			
			result.add(new ProjectDto(entry.getKey(), proBuds, budget));
			
		}
		return result;
		
//		var haha = rawData.stream()
//				.collect(Collectors.groupingBy(ProjectDtoRawData::getDepartmentName, Collectors.mapping(t -> {
//					return new AbstractMap.SimpleEntry<String, Integer>(t.getProjectName(), t.getBudget());
//				}, Collectors.toSet())));

	}
}