package com.ponta027.guice.sample.tweet;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class TweetClientSingleton {
	@Inject
	Provider<Shortener> shortenerProvider;
	@Inject
	Tweeter tweeter;

	public void show() {
		Shortener shortener = shortenerProvider.get();
		tweeter.send("HOGE");
		System.out.println(tweeter.toString());
		System.out.println(shortener.toString());
	}
}
