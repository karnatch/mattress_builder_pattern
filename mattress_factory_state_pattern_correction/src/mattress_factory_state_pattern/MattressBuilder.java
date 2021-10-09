package mattress_factory_state_pattern;

public abstract class MattressBuilder {
	Mattress mattress = new Mattress();
	public abstract MattressBuilder startProduction();
	public abstract MattressBuilder endProduction();

	public Mattress build() {
		System.out.println("Helmet manufacture successful!");
		return mattress;
	}
}
