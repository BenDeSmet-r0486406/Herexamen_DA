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
		return "try /Comp/{title}";
	}
	
	@RequestMapping("/Comp/{title}")
	public CompositeMovie getComposite(@PathVariable("title") String title) {
		//get all info
		return service.getAll(title);
	}
	
	@RequestMapping("/recommendations")
	public String getAllRecs() {
		return service.getRecs();
	}
}
