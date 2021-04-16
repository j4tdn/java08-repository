package service;

import dao.ProjectDao;
import persistence.Project;
import persistence.ProjectDto;
import persistence.ProjectRawData;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProjectService {
    private ProjectDao projectDao;

    public ProjectService() {
        projectDao = new ProjectDao();
    }

    public List<Project> getProjects(double budget) {
        return projectDao.getProjects(budget);
    }

    public List<ProjectDto> getProBudgets() {
        List<ProjectDto> result = new ArrayList<>();
        List<ProjectRawData> rawData = projectDao.getProBudgets();
        Map<String, List<ProjectRawData>> dataMap = rawData.stream().collect(Collectors.groupingBy(ProjectRawData::getDeptName));
        for (Map.Entry<String, List<ProjectRawData>> entry : dataMap.entrySet()) {
            List<AbstractMap.SimpleEntry<String, Double>> proBuds = entry.getValue().stream().map(rawItem -> new AbstractMap.SimpleEntry<>(rawItem.getProName(), rawItem.getBudget()))
                    .collect(Collectors.toList());
            Double budget = entry.getValue().stream().mapToDouble(ProjectRawData::getBudget).sum();
            result.add(new ProjectDto(entry.getKey(), proBuds, budget));
        }
        return result;
    }
}
