package json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConvertUniversityStandard {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			UniversityStandardClass standard = mapper.readValue(new File("university_standard.json"), UniversityStandardClass.class);
			System.out.print(standard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
