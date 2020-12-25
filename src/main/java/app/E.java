package app;

import java.util.ArrayList;
import java.util.List;

public class E {
	List<String> dataList = new ArrayList<String>();
	
	public E() {
		System.out.println("Ctor di kelas E");
	}
	
	public String toString() {
		return "toString di kelas E";
	}

	public boolean conntains(String n) {
		return true;
	}
	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

}
