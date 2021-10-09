package mattress_factory_state_pattern;


public class StatePattern {

	public static void main(String[] args) {
		new MattressFactory(2);
		
		MattressBuilder latexBuilder = new LatexMattressBuilder();
		MattressBuilder matt = latexBuilder.startProduction().endProduction();
		System.out.println("Mattress builder pattern compile successful"); 
		System.out.println(matt); 

	}
}
