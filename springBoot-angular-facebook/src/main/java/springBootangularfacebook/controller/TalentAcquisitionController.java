package springBootangularfacebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootangularfacebook.model.JobRequest;
import springBootangularfacebook.service.TalentAcquisitionService;

@RestController
@RequestMapping("api/talentAcquisition")
public class TalentAcquisitionController {

	@Autowired
	private TalentAcquisitionService talentAcquisitionService;

	@GetMapping("getJobRequestsDetails")
	public List<JobRequest> getJobRequestDetails() {
		return talentAcquisitionService.getJobRequestDetails();
		
	}

}
