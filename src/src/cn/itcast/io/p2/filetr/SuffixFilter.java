package cn.itcast.io.p2.filetr;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

	private String suffix;
	
	public SuffixFilter(String suffix) {
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO �Զ����ɵķ������
		return name.endsWith(suffix);
	}

}
