package springBootangularfacebook.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("jobRequest")
@NoArgsConstructor
@AllArgsConstructor
public class JobRequest {

	public int jobId;

	public int reqNumber;

	public String grade;

	public String HMMSID;

	public String HMEmailID;

	public String GLCode;

	public String JDUrl;

	public int ReqNoOpenings;

	public String HMName;

	public String JobStatus;

	public String PrimarySkillSet;

	public String SecondarySkillSet;

	public String GoodToHaveSkillSet;

	public int LocationId;

	public String Location;

	public String Designation;

	public Date JobCreatedDate;

	public String JobCreatedBy;

	public Date JobLastUpdatedDate;

	public String JobLastUpdatedBy;

	public String Comments;

	public Boolean IsAssigned;

	public String TAResourceID;

	public String TAEmailID;

}
