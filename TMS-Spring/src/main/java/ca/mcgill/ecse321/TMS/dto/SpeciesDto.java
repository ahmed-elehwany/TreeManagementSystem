package ca.mcgill.ecse321.TMS.dto;

import java.util.ArrayList;
import java.util.List;

import ca.mcgill.ecse321.TMS.model.Tree;

public class SpeciesDto {
	String name; 
	int carbonConsumption; 
	int oxygenProduction;
	private List<Tree> trees;
	
	public SpeciesDto() {
		
	}
	
	public SpeciesDto(String name, int carbonConsumption, int oxygenProduction, ArrayList<Tree> trees) {
		this.name = name;
		this.carbonConsumption = carbonConsumption;
		this.oxygenProduction = oxygenProduction;
		this.trees = trees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarbonConsumption() {
		return carbonConsumption;
	}

	public void setCarbonConsumption(int carbonConsumption) {
		this.carbonConsumption = carbonConsumption;
	}

	public int getOxygenProduction() {
		return oxygenProduction;
	}

	public void setOxygenProduction(int oxygenProduction) {
		this.oxygenProduction = oxygenProduction;
	}

	public List<Tree> getTrees() {
		return trees;
	}

	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}
	
	
}
