package DeSmetBen.Composite_Omdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositeController {

	@Autowired
	private CompService service;
	
	@RequestMapping("/info")
	public String actived() {
		return "try /comp/{title}";
	}
	
	@RequestMapping("/comp/{title}")
	public CompositeMovie getComposite(@PathVariable("title") String title) {
		return service.getAll(title);
	}
	
	@RequestMapping("/getMovie/{title}")
	public String getMovie(@PathVariable("title") String title) {
		return service.getMovie(title);
	}
	
	@RequestMapping("/getRec/{title}")
	public String getRec(@PathVariable("title") String title) {
		return service.getRec(title);
	}
	
	@RequestMapping("/getRev/{title}")
	public String getRev(@PathVariable("title") String title) {
		return service.getRev(title);
	}
	
	@RequestMapping("/recommendations")
	public String getAllRecs() {
		return service.getRecs();
	}
	
	@RequestMapping("/reviews")
	public String getAllRevs() {
		return service.getRevs();
	}
}
