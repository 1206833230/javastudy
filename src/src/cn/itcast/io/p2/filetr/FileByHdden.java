package cn.itcast.io.p2.filetr;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileByHdden implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		// TODO 自动生成的方法存根
		return !pathname.isHidden();
	}


}
