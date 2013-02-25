package com.ponta027.guice.sample.tweet;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class TweetModule extends AbstractModule {

	@Override
	protected void configure() {

		// bind(TweetClient.class);
		// このbindをはずすとTweeterClientのInjectionはデフォルトのクラスのオブジェクトが入る。
		bind(Tweeter.class).to(SmsTweeter.class);

		// singleton
		// bind(Tweeter.class).to(SmsTweeter.class).in(Singleton.class);

		//
		bind(String.class).annotatedWith(Username.class).toInstance("jesse");
	}

	@Provides
	Shortener providerShortener() {
		return new TinyUrlShortener();
	}

}
