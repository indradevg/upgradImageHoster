package ImageHoster.repository;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.model.User;

@Repository
public class CommentRepository {
	
	
	//get an instance of EntityMangerFactory from persistence unit
	@PersistenceUnit(unitName = "imageHoster")
	private EntityManagerFactory emf;
	
	
	public void uploadComment(Image image, String comment, User user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		//
		Comment newComment = new Comment();
		newComment.setCreatedDate(new Date(System.currentTimeMillis()));
	newComment.setImage(image);
	newComment.setText(comment);
	newComment.setUser(user);
	
	try {
		transaction.begin();
		em.persist(newComment);
		transaction.commit();
	} catch (Exception e) {
		 transaction.rollback();
	}
		
	}
}
