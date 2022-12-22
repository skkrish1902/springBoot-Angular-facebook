package springBootangularfacebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootangularfacebook.model.Dashboard;
import springBootangularfacebook.service.DashboardService;

@RestController
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardService;
	

	@PostMapping("/addUser")
	public Dashboard addUser(@RequestBody Dashboard dashboardData) {
		return dashboardService.addUser(dashboardData);
	}
	
	@GetMapping("/getUser")
	public Dashboard getUser(@RequestParam Long id) {
		
		return dashboardService.getUser(id);
	}
	
	@DeleteMapping("/deleteAllUsers")
	public void deleteUser() {
		
		dashboardService.deleteAllUser();
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestParam Long id) {
		
		dashboardService.deleteUser(id);
	}
	
}
