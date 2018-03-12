package abstractfactorypattern;

public abstract class AbstractConfigurationFactory {

	abstract CPU getCPU(String CPU);
	abstract GraphicsCard getGraphicsCard(String GraphicsCard);
	abstract HardDisk getHardDisk (String HardDisk);
	abstract MotherBoard getMotherBoard (String MotherBoard );
	abstract Memory getMemory (String Memory);
}
