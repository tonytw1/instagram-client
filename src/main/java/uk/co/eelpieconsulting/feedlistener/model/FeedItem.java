package uk.co.eelpieconsulting.feedlistener.model;

import java.io.Serializable;
import java.util.Date;

import uk.co.eelpieconsulting.common.geo.model.LatLong;
import uk.co.eelpieconsulting.common.geo.model.Place;

public class FeedItem implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String title;
	
	private String url;

	private String body;

	private Date date;
	
	private Place place;
	private String imageUrl;
	
	private String subscriptionId;

	private String author;
	
	public FeedItem() {
	}
	
	public FeedItem(String title, String url, String body, Date date, Place place, String imageUrl, String author) {
		this.title = title;
		this.url = url;
		this.body = body;
		this.date = date;
		this.place = place;
		this.imageUrl = imageUrl;
		this.author = author;
	}
	
	public String getId() {
		return getGUID();
	}

	private String getGUID() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}
	
	public String getBody() {
		return body;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Place getPlace() {
		return place;
	}
	
	public LatLong getLatLong() {
		return place != null ? place.getLatLong() : null;
	}

	public String getImageUrl() {
		return imageUrl;
	}
	
	public boolean isGeoTagged() {
		return place != null;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getDescription() {
		return body;
	}
	
	public String getHeadline() {
		return title;
	}
	
	public String getWebUrl() {
		return url;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}
	
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;		
	}
	
}
