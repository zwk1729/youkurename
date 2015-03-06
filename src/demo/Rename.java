package demo;

import java.io.File;

public class Rename {

	public void ChangeFileName(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			String FileNamelist = "";
			String list = FileNamelist.trim();
			for (File f : files) {
				String originalName = f.getName();
				String on = originalName.substring(0, 13);
				String name = list.substring(list.indexOf("item_"+on)+27,list.indexOf("item_"+on)+31);
				System.err.println("ren "+originalName+" "+name.replaceAll(",","")+".mp4");
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("F:\\1");
		new Rename().ChangeFileName(file);
	}
}
