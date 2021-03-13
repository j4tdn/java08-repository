package persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeInfo {
	
	public static String GRADE_NAME = "gradeName";
	public static String STUDENT_NAME = "studentName";
	public static String EMAIL = "email";
	
	private String gradeName;
	private String studentName;
	private String email;
}
