package ImageHoster.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ImageHoster.model.Image;
import ImageHoster.model.User;
import ImageHoster.service.CommentService;
import ImageHoster.service.ImageService;

@Controller
public class CommentController {
	
	@Autowired
	private ImageService imageService;
	
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(path="/image/{imageId}/{imageTitle}/comment",method = RequestMethod.POST)
	public String uploadComments(@RequestParam("comment") String comment, @PathVariable("imageId") Integer imageId, @PathVariable("imageTitle") String imgTitle, HttpSession session) {
		
		// need to get the image and user details from the obtained data
    	User user = (User) session.getAttribute("loggeduser");
    	Image image = this.imageService.findImageByImageId(imageId);
    	this.commentService.uploadComment(image, comment, user);
    	
    	return "redirect:/images/"+imageId+"/"+imgTitle;	}
}
