package mattress_factory_state_pattern;


public class Mattress {
	
	State startProduction;
	State endProduction;
	
	State state;
	

	Mattress startProduction(ProductionOnState prod) {
		this.startProduction = prod;
		return this;
	}
	Mattress endProduction(ProductionOffState prod) {
		this.endProduction = prod;
		return this;
	}

}

