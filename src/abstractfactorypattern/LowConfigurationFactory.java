package abstractfactorypattern;

public class LowConfigurationFactory extends AbstractConfigurationFactory{

	@Override
	CPU getCPU(String CPU) {
		// TODO 自动生成的方法存根
		return new Inteli7() ;
	}

	@Override
	GraphicsCard getGraphicsCard(String GraphicsCard) {
		// TODO 自动生成的方法存根
		return new iGame1050Ti();
	}

	@Override
	HardDisk getHardDisk(String HardDisk) {
		// TODO 自动生成的方法存根
		return new SpinpointM8();
	}

	@Override
	MotherBoard getMotherBoard(String MotherBoard) {
		// TODO 自动生成的方法存根
		return new PRIMEB250MPLUS();
	}

	@Override
	Memory getMemory(String Memory) {
		// TODO 自动生成的方法存根
		return new REG8GBDDR4();
	}

}
