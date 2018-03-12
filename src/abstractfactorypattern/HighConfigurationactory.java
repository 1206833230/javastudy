package abstractfactorypattern;

public class HighConfigurationactory extends AbstractConfigurationFactory{

	@Override
	CPU getCPU(String CPU) {
		// TODO �Զ����ɵķ������
		return new Inteli9();
	}

	@Override
	GraphicsCard getGraphicsCard(String GraphicsCard) {
		// TODO �Զ����ɵķ������
		return new GeForceGTX1060GAMER();
	}

	@Override
	HardDisk getHardDisk(String HardDisk) {
		// TODO �Զ����ɵķ������
		return new M9T2TB();
	}

	@Override
	MotherBoard getMotherBoard(String MotherBoard) {
		// TODO �Զ����ɵķ������
		return new PRIMEB250PRO();
	}

	@Override
	Memory getMemory(String Memory) {
		// TODO �Զ����ɵķ������
		return new REG16GBDDR42133();
	}

}
