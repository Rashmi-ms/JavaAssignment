package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class News {
	int newsId; 
	String postedByUser; 
	String commentByUser; 
	String comment;

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	@Override
	 public String toString() {
	        return "News[ newsId=" + newsId + " postedByUser=" + postedByUser + " commentByUser=" + commentByUser + " comment=" + comment + " ]";
	    }

	public static void main(String[] args) {
		List < News > news = new ArrayList < News > ();
		news.add(new News( 3, "post1", "Pune,budget,hello", "comment"));
		news.add(new News(6, "post2", "why budget", "comment"));
		news.add(new News(9, "post3", "single comment", "comment"));
		news.add(new News(12, "post4", "covid, pandemic", "comment"));
		
		Comparator<News> comparator = Comparator.comparing(News::getComment);
        News minObject = news.stream().min(comparator).get();
        News maxObject = news.stream().max(comparator).get();
        System.out.println("minobject=" + minObject);
        System.out.println("maxobject=" + maxObject);
        
		

	}

}
