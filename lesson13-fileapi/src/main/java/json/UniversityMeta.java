package json;

public class UniversityMeta {
	private String url;
	private String university_code;
	private String university_name;
	
	public UniversityMeta() {
	}

	public UniversityMeta(String url, String university_code, String university_name) {
		this.url = url;
		this.university_code = university_code;
		this.university_name = university_name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUniversity_code() {
		return university_code;
	}

	public void setUniversity_code(String university_code) {
		this.university_code = university_code;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	@Override
	public String toString() {
		return "UniversityMeta [url=" + url + ", university_code=" + university_code + ", university_name="
				+ university_name + "]";
	}
	
}
