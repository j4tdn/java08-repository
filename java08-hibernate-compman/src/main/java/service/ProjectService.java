package service;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import dao.HibernateProjectDao;
import persistence.Project;
import persistence.ProjectDTO;
import persistence.ProjectDTORawData;

public class ProjectService {
	private HibernateProjectDao projectdao;
	
	public ProjectService() {
		projectdao = new HibernateProjectDao();
	}
	
	public List<Project> getProject(double bubget){
		return projectdao.getProjecs(bubget);
	}
	
	public List<ProjectDTO> getProBubgets(){
		List<ProjectDTO> result = new ArrayList<>();
		List<ProjectDTORawData> rawData = projectdao.getProBubgets();
		Map<String, List<ProjectDTORawData>> dataMap = rawData.stream().collect(Collectors.groupingBy(ProjectDTORawData::getDept_name));
		for(Entry<String, List<ProjectDTORawData>> entry : dataMap.entrySet()) {
			ProjectDTO pro = new ProjectDTO();
		    entry.getValue()
		    .stream()
		    .map(item -> SimpleEntry<String, Double>(item.getDept_name(). item.getBubget()));
					
		}
		
		return result;
	}

}
