package com.ponta027.guice.sample.tweet;

import com.google.inject.Inject;

public class TweetClient {
	private final Shortener shortner;
	private final Tweeter tweeter;

	@Inject
	public TweetClient(Shortener shortner, Tweeter tweeter) {
		this.shortner = shortner;
		this.tweeter = tweeter;
		System.out.println(shortner);
		System.out.println(tweeter);
	}

	public void show() {
		tweeter.send("HOGE");
		System.out.println(tweeter.toString());
	}
}
