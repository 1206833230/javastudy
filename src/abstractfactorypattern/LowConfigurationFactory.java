package abstractfactorypattern;

public class LowConfigurationFactory extends AbstractConfigurationFactory{

	@Override
	CPU getCPU(String CPU) {
		// TODO �Զ����ɵķ������
		return new Inteli7() ;
	}

	@Override
	GraphicsCard getGraphicsCard(String GraphicsCard) {
		// TODO �Զ����ɵķ������
		return new iGame1050Ti();
	}

	@Override
	HardDisk getHardDisk(String HardDisk) {
		// TODO �Զ����ɵķ������
		return new SpinpointM8();
	}

	@Override
	MotherBoard getMotherBoard(String MotherBoard) {
		// TODO �Զ����ɵķ������
		return new PRIMEB250MPLUS();
	}

	@Override
	Memory getMemory(String Memory) {
		// TODO �Զ����ɵķ������
		return new REG8GBDDR4();
	}

}
