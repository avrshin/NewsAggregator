package my.newsaggregator.domain.rss;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class RSSChannel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	//description, link, and title are required elements of a RSS channel
	@NotNull
	private String description;
	@NotNull
	private String link;
	@NotNull
	private String title;
	
	//these elements are optional but are often part of a RSS channel
	private String generator;
	private String language;
	private String lastBuildDate;
	private String copyright;
	private String imageUrl;
	private String imageLink;
	private String imageTitle;
	private String ttl;
	
	public RSSChannel() {}

}
