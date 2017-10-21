package my.newsaggregator.domain.rss;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import my.newsaggregator.domain.rss.builder.RSSChannelBuilder;

@Entity
public class RSSChannel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	private String channelURL;
	
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
	private String imageURL;
	private String imageLink;
	private String imageTitle;
	private String ttl;
	
	public RSSChannel() {}
	
	public RSSChannel(RSSChannelBuilder builder) {
		this.channelURL = builder.channelURL;
		this.description = builder.description;
		this.link = builder.link;
		this.title  = builder.title;
		this.generator = builder.generator;
		this.language = builder.language;
		this.lastBuildDate = builder.lastBuildDate;
		this.copyright = builder.copyright;
		this.imageURL = builder.imageURL;
		this.imageLink = builder.imageLink;
		this.imageTitle = builder.imageTitle;
		this.ttl = builder.ttl;
	}
}
