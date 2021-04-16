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
import persistence.ProjectDtoRawData;

public class ProjectService {
	
		ProjectDao projectDao= new ProjectDao();
	
	public List<Project> getProjectByBudget(double d) {	
		return projectDao.getProjectByBudget(d);
	}
	
	public List<ProjectDTO> getProBudget() {
		List<ProjectDtoRawData> rawDatas = projectDao.getProjectSumBudget();
		List<ProjectDTO> listDTO = new ArrayList<ProjectDTO>();
		Map<String, List<ProjectDtoRawData>> dataMap = rawDatas.stream().
				collect(Collectors.groupingBy(ProjectDtoRawData::getDepartmentName));
		
		for(Entry<String, List<ProjectDtoRawData>> entry : dataMap.entrySet()) {
			//name
			ProjectDTO dto = new ProjectDTO();
			dto.setDepartmentName(entry.getKey());
			//list
			List<SimpleEntry<String, Double>> proBudget = entry.getValue().stream()
													.map(rawItem -> new SimpleEntry<String, Double>(rawItem.getProjectName(),rawItem.getBudget()))
													.collect(Collectors.toList());
			dto.setProBuds(proBudget);
			//sum
			Double budgetDouble = entry.getValue().stream().mapToDouble(ProjectDtoRawData ::getBudget).sum();
			dto.setTotalOfBudget(budgetDouble);
			listDTO.add(dto);
		}
		return listDTO;
	}
}
