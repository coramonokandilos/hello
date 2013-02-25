package com.ponta027.guice.sample.tweet;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class TweetModuleSingleton extends AbstractModule {

	@Override
	protected void configure() {

		// bind(TweetClient.class);
		// ����bind���͂�����TweeterClient��Injection�̓f�t�H���g�̃N���X�̃I�u�W�F�N�g������B
		// bind(Tweeter.class).to(SmsTweeter.class);

		// singleton
		bind(Tweeter.class).to(SmsTweeter.class).in(Singleton.class);

		//
		bind(String.class).annotatedWith(Username.class).toInstance("jesse");
	}

	@Provides
	@Singleton
	Shortener providerShortener() {
		return new TinyUrlShortener();
	}

}
