package springBootangularfacebook.service;

import java.util.Optional;
import java.util.OptionalLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import springBootangularfacebook.model.Dashboard;

@Component
public class DashboardService {

	@Autowired
	private MongoTemplate mongoTemplate;
	

	public Dashboard addUser(Dashboard data) {
			
		OptionalLong maxId =mongoTemplate.findAll(Dashboard.class).stream().mapToLong(Dashboard::getId).max();
		
		if(maxId.isPresent()) {
			data.setId(maxId.getAsLong()+1l);
		}else {
			data.setId(1l);
		}
		
		return mongoTemplate.save(data);
	}
	
	
	public Dashboard getUser(Long id) {

		return mongoTemplate.findById(id, Dashboard.class);
	}
	
	public void deleteAllUser() {

		mongoTemplate.dropCollection(Dashboard.class);
	}
	
	public void deleteUser(Long id) {

		Query q= new Query();
		q.addCriteria(Criteria.where("_id").is(id));
		
		mongoTemplate.remove(q, Dashboard.class);
		
	}
	
}
