package ImageHoster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ImageHoster.service.ImageService;

@Controller
public class CommentController {
	
	private ImageService imageService;
	
	
	@RequestMapping(path="/image/{imageId}/{imageTitle}/comment",method = RequestMethod.POST)
	public String uploadComments(@RequestParam("comment") String comment, @PathVariable("imageId") Integer imageId, @PathVariable("imageTitle") String imgTitle) {
		
		
		return "";
	}
}
