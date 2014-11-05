package uk.co.eelpieconsulting.instagram.api;

import static org.junit.Assert.assertEquals;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import uk.co.eelpieconsulting.feedlistener.model.InstagramUser;

public class InstagramUserParserTest {

	@Test
	public void canParseInstragramUser() throws Exception {
		final String json = IOUtils.toString(this.getClass().getClassLoader().getResourceAsStream("userSelf.json"));		

		final InstagramUser user = new InstagramUserParser().parse(json);
		
		assertEquals(123, user.getId());
		assertEquals("auser", user.getUsername());
		assertEquals("http://images.ak.instagram.com/profiles/anonymousUser.jpg", user.getProfilePicture());
	}
	
}
