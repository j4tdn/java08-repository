package json;

import java.util.List;

public class Item {
	private List<StandardPoint> diemchuan_datas;
	private UniversityMeta university_meta;
	
	public Item() {
	}

	public List<StandardPoint> getDiemchuan_datas() {
		return diemchuan_datas;
	}

	public void setDiemchuan_datas(List<StandardPoint> diemchuan_datas) {
		this.diemchuan_datas = diemchuan_datas;
	}

	public UniversityMeta getUniversity_meta() {
		return university_meta;
	}

	public void setUniversity_meta(UniversityMeta university_meta) {
		this.university_meta = university_meta;
	}
	
	@Override
	public String toString() {
		System.out.println("=============university_meta===============");
		System.out.println(university_meta);
		
		System.out.println("=============diemchuan_datas===============");
		for (StandardPoint point: diemchuan_datas) {
			System.out.println(point);
		}
		return "";
	}
	
}
