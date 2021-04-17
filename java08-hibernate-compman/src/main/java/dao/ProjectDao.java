package dao;

import java.util.List;

import persistence.Project;
import persistence.ProjectDTORawData;

public interface ProjectDao {
	public List<Project> getProjecs(double bubget);
	public List<ProjectDTORawData> getProBubgets();


}
