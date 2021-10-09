package mattress_factory_state_pattern;


public class LatexMattressBuilder extends MattressBuilder {

	@Override
	public MattressBuilder startProduction() {
		mattress.startProduction(new ProductionOnState(null));
		return this;
	}
	@Override
	public MattressBuilder endProduction() {
		mattress.endProduction(new ProductionOffState(null));
		return this;
	}
}
