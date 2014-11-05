package uk.co.eelpieconsulting.instagram.api;

import org.json.JSONException;
import org.json.JSONObject;

import uk.co.eelpieconsulting.feedlistener.model.InstagramUser;

public class InstagramUserParser {

	public InstagramUser parse(String json) throws JSONException {
		final JSONObject userJson = new JSONObject(json);
		final JSONObject dataJson = userJson.getJSONObject("data");
		return new InstagramUser(dataJson.getLong("id"),
				dataJson.getString("username"),
				dataJson.getString("profile_picture"));
	}
	
}
