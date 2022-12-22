package springBootangularfacebook.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("dashboard")
public class Dashboard {
	public static final String SEQUENCE_NAME = "dashboard";
	
	@Id
	private Long id;
	private String userName;
	private LocalDateTime dob;
	private String userThoughts;
	
}
