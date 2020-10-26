package ImageHoster.service;

import org.springframework.stereotype.Service;

import ImageHoster.model.Image;
import ImageHoster.model.User;
import ImageHoster.repository.CommentRepository;

@Service
public class CommentService {
	
	private CommentRepository commentRepository;
	
	public void uploadComment(Image image, String comment, User user) {
		this.commentRepository.uploadComment(image, comment, user);
	}
		

}
