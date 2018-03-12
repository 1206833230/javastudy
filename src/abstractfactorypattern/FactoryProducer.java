package abstractfactorypattern;

public class FactoryProducer {
	public static AbstractConfigurationFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("1"))
		{
			return new HighConfigurationactory();
		}
		else if(choice.equalsIgnoreCase("2"))
		{
			return new LowConfigurationFactory();
		}
		
		return null;
		
	}

}
