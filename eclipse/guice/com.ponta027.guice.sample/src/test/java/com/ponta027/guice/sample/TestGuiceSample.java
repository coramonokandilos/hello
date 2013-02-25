package com.ponta027.guice.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ponta027.guice.sample.tweet.TweetClient;
import com.ponta027.guice.sample.tweet.TweetClientProvider;
import com.ponta027.guice.sample.tweet.TweetClientSingleton;
import com.ponta027.guice.sample.tweet.TweetModule;
import com.ponta027.guice.sample.tweet.TweetModuleProvider;
import com.ponta027.guice.sample.tweet.TweetModuleSingleton;

public class TestGuiceSample {

	@Test
	public void test() {

		Injector injector = Guice.createInjector(new TweetModule());
		execute(injector);
	}

	@Test
	public void testSingleton() {
		Injector injector = Guice.createInjector(new TweetModuleSingleton());
		TweetClientSingleton instance = injector
				.getInstance(TweetClientSingleton.class);
		for (int i = 0; i < 10; i++) {
			TweetClientSingleton instance2 = injector
					.getInstance(TweetClientSingleton.class);
			assertEquals(instance, instance2);
		}
	}

	@Test
	public void testProvider() {
		System.out.println(">>>>>>>>>");
		Injector injector = Guice.createInjector(new TweetModuleProvider());
		TweetClientProvider instance = injector.getInstance(TweetClientProvider.class);
		instance.show();
		System.out.println(instance);
		System.out.println("<<<<<<<<<");

	}

	private void execute(Injector injector) {
		TweetClient instance = injector.getInstance(TweetClient.class);
		instance.show();
		System.out.println(instance);
	}

}
