package ImageHoster.model;

import java.sql.Date;

import javax.persistence.*;



@Entity
@Table(name="comments")

public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id ;
	
	
	@Column(name="text",columnDefinition = "TEXT",length = 256)
	private String text;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "image_id")
	private Image image;

	
	
	public Comment() {
	}
	
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}




	@Override
	public String toString() {
		return "Comment [id=" + id + ", text=" + text + ", createdDate=" + createdDate + ", user=" + user + ", image="
				+ image + "]";
	}


	
	
	
	
}
