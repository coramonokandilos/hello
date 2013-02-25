package com.ponta027.guice.sample.tweet;

import com.google.inject.Inject;

public class SmsTweeter extends Tweeter {

	private final String username;

	@Inject
	public SmsTweeter(@Username String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return super.toString() + " username:" + username;
		// return super.toString();
	}
}
