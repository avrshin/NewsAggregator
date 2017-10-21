package my.newsaggregator.domain.rss.builder;

import my.newsaggregator.domain.rss.RSSChannel;

public class RSSChannelBuilder {
	public String channelURL;
	public String description;
	public String link;
	public String title;
	public String generator;
	public String language;
	public String lastBuildDate;
	public String copyright;
	public String imageURL;
	public String imageLink;
	public String imageTitle;
	public String ttl;
	
	public RSSChannelBuilder(String channelURL, String description, String link, String title) {
		this.channelURL = channelURL;
		this.description = description;
		this.link = link;
		this.title = title;
	}
	
	public RSSChannelBuilder withGenerator(String generator) {
		this.generator = generator;
		return this;
	}
	
	public RSSChannelBuilder withLanguage(String language) {
		this.language = language;
		return this;
	}
	
	public RSSChannelBuilder withLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
		return this;
	}
	
	public RSSChannelBuilder withCopyright(String copyright) {
		this.copyright = copyright;
		return this;
	}
	
	public RSSChannelBuilder withImageLink(String imageLink) {
		this.imageLink = imageLink;
		return this;
	}
	
	public RSSChannelBuilder withImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
		return this;
	}
	
	public RSSChannelBuilder withImageURL(String imageURL) {
		this.imageURL = imageURL;
		return this;
	}
	
	public RSSChannelBuilder withTTL(String ttl) {
		this.ttl = ttl;
		return this;
	}
	
	public RSSChannel build() {
		return new RSSChannel(this);
	}
}
