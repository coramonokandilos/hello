package com.ponta027.logwatcher.core;

import org.eclipse.core.runtime.IStatus;

public interface IErrorCheckStrategy {
	IStatus check(String line);
	void report(IStatus status);
}
