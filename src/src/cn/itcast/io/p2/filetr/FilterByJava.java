package cn.itcast.io.p2.filetr;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByJava implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO �Զ����ɵķ������
		
		return name.endsWith(".java");
	}

}
