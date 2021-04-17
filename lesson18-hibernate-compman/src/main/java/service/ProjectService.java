package service;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import dao.HibernateProjectDao;
import dao.ProjectDao;
import persistence.Project;
import persistence.ProjectDto;
import persistence.ProjectDtoRawData;

public class ProjectService {
	private static ProjectDao projectDao;
	static {
		projectDao = new HibernateProjectDao();
	}

	public List<Project> get(Double budget) {
		return projectDao.get(budget);
	}

	public List<ProjectDto> getTotalOfBudget(Integer year) {
		List<ProjectDto> result = new ArrayList<ProjectDto>();
		List<ProjectDtoRawData> rawDatas = projectDao.getTotalOfBudget(year);
		Map<String, List<ProjectDtoRawData>> dataMap = rawDatas.stream()
				.collect(Collectors.groupingBy(ProjectDtoRawData::getDeptName));
		for (Entry<String, List<ProjectDtoRawData>> entry : dataMap.entrySet()) {
			
			List<SimpleEntry<String, Double>> proBuds = entry.getValue().stream()
					.map(rawItem -> new SimpleEntry<String, Double>(rawItem.getProName(), rawItem.getBudget()))
					.collect(Collectors.toList());
			
			Double sum = entry.getValue().stream().mapToDouble(ProjectDtoRawData::getBudget).sum();
			
			result.add(new ProjectDto(entry.getKey(), proBuds, sum));
		}

		return result;
	}

	public Project getHighestBudget(Integer year) {
		return projectDao.getHighestBudget(year);
	}
}
