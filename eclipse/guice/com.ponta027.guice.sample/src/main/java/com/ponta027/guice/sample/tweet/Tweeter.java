package com.ponta027.guice.sample.tweet;

public class Tweeter {
	public void send(String text) {
		System.out.println(this.getClass().getSimpleName());
	}
}
