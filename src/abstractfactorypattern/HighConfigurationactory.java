package abstractfactorypattern;

public class HighConfigurationactory extends AbstractConfigurationFactory{

	@Override
	CPU getCPU(String CPU) {
		// TODO 自动生成的方法存根
		return new Inteli9();
	}

	@Override
	GraphicsCard getGraphicsCard(String GraphicsCard) {
		// TODO 自动生成的方法存根
		return new GeForceGTX1060GAMER();
	}

	@Override
	HardDisk getHardDisk(String HardDisk) {
		// TODO 自动生成的方法存根
		return new M9T2TB();
	}

	@Override
	MotherBoard getMotherBoard(String MotherBoard) {
		// TODO 自动生成的方法存根
		return new PRIMEB250PRO();
	}

	@Override
	Memory getMemory(String Memory) {
		// TODO 自动生成的方法存根
		return new REG16GBDDR42133();
	}

}
