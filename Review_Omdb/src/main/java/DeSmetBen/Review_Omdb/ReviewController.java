package DeSmetBen.Review_Omdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RevService service;
	
	@RequestMapping("/info")
	public String activated(){
		return "try /review/getRev/{title} or /review/all" ;
	}
	
	@RequestMapping("/review/getRev/{title}")
	public String getReview(@PathVariable("title") String title){
		return this.service.getRev(title).getReview();
	}
	
	@RequestMapping("/review/{title}")
	public Review Review(@PathVariable("title") String title){
		return this.service.getRev(title);
	}
	
	@RequestMapping("/review/all")
	public List<Review> getAll(){
		return this.service.getAllRevs();
	}
}
