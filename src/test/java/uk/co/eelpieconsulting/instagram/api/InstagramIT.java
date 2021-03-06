package uk.co.eelpieconsulting.instagram.api;

import java.util.List;

import org.junit.Test;

import uk.co.eelpieconsulting.common.http.HttpBadRequestException;
import uk.co.eelpieconsulting.feedlistener.model.FeedItem;
import uk.co.eelpieconsulting.feedlistener.model.InstagramUser;

public class InstagramIT {
	
	private final String CLIENT_ID = "";
	private final String CLIENT_SECRET = "";	
	private static final String ACCESS_TOKEN = "";

	private final InstagramApi api;

	public InstagramIT() {
		this.api = new InstagramApi();
	}
	
	@Test
	public void canVerifyAccessTokenOwner() throws Exception {
		final InstagramUser self = api.self(ACCESS_TOKEN);
		System.out.println(self);
	}
	
	@Test
	public void canFetchRecentPostForTag() throws Exception {
		List<FeedItem> recentMediaForTag = api.getRecentMediaForTag("twickenham", ACCESS_TOKEN);		
		System.out.println(recentMediaForTag);
	}

	@Test
	public void canSubscribe() throws Exception {
		try {
			api.createTagSubscription("twickenham", CLIENT_ID, CLIENT_SECRET, "http://genil.eelpieconsulting.co.uk/instagram/callback", "a-channel", "tonytw1");
			
		} catch (HttpBadRequestException e) {
			System.out.println(e.getResponseBody());
		}
	}
	
	@Test
	public void canListAllSubscriptions() throws Exception {
		System.out.println(api.getSubscriptions(CLIENT_ID, CLIENT_SECRET));
	}
	
	@Test
	public void canUnsubscribeAll() throws Exception {
		InstagramApi api = new InstagramApi();
		try {
			api.deleteAllSubscriptions(CLIENT_ID, CLIENT_SECRET);
		} catch (HttpBadRequestException e) {
			System.out.println(e.getResponseBody());
		}
	}

}
