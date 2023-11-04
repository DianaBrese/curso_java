package exercicios_enumeracoes_composicoes.entities;

import java.util.ArrayList;
import java.util.List;

import exercicios_enumeracoes_composicoes.entities.enums.WorkerLevel;

public class Worker {
 private String name;
 private WorkerLevel level;
 private Double baseSalary;
 private Department department;
 private List<HourContract> contratcs = new ArrayList<>();;
 
public Worker() {
}

public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
	this.name = name;
	this.level = level;
	this.baseSalary = baseSalary;
	this.department = department;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public WorkerLevel getLevel() {
	return level;
}

public void setLevel(WorkerLevel level) {
	this.level = level;
}

public Double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}

public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

public List<HourContract> getContratcs() {
	return contratcs;
}


public void addContract(HourContract contract) {
	this.contratcs.add(contract);
}

public void removeContract(HourContract contract) {
	this.contratcs.remove(contract);
}

public double income(Integer month, Integer year) {
	double sum = baseSalary;
	for(HourContract c : contratcs) {
		if(c.getDate().getYear() == year && c.getDate().getMonthValue() == month) {
			sum += c.totalValue();
		}
	}
	return sum;
}
}
