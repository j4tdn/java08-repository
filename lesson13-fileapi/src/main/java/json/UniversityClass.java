package json;

import java.util.List;

public class UniversityClass {
	private List<Data> datas;

	public UniversityClass() {
	}
	
	public UniversityClass(List<Data> datas) {
		this.datas = datas;
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
	}

	
	@Override
	public String toString() {
		for (Data data: datas) {
			System.out.println(data);
		}
		return "";
	}
	
}
