package json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter {
	public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            UniversityClass university = mapper.readValue(new File("university.json"), UniversityClass.class);
            System.out.print(university);
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
}
