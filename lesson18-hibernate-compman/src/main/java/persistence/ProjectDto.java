package persistence;

import java.util.AbstractMap;
import java.util.List;

public class ProjectDto {
    private String deptName;
    private List<AbstractMap.SimpleEntry<String, Double>> proBudget;
    private Double totalOfBudget;

    public ProjectDto() {
    }

    public ProjectDto(String deptName, List<AbstractMap.SimpleEntry<String, Double>> proBudget, Double totalOfBudget) {
        this.deptName = deptName;
        this.proBudget = proBudget;
        this.totalOfBudget = totalOfBudget;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<AbstractMap.SimpleEntry<String, Double>> getProBudget() {
        return proBudget;
    }

    public void setProBudget(List<AbstractMap.SimpleEntry<String, Double>> proBudget) {
        this.proBudget = proBudget;
    }

    public Double getTotalOfBudget() {
        return totalOfBudget;
    }

    public void setTotalOfBudget(Double totalOfBudget) {
        this.totalOfBudget = totalOfBudget;
    }

    @Override
    public String toString() {
        return "ProjectDto{" +
                "deptName='" + deptName + '\'' +
                ", proBudget=" + proBudget +
                ", totalOfBudget=" + totalOfBudget +
                '}';
    }
}
