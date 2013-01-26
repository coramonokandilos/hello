package com.ponta027.swtgraph.sample;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.csstudio.swt.widgets.figures.MeterFigure;
import org.csstudio.swt.xygraph.util.XYGraphMediaFactory;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.SchemeBorder;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MeterExample {
	private static int counter = 0;

	public static void main(String[] args) {
		final Shell shell = new Shell();
		shell.setSize(300, 150);
		shell.open();

		// use LightweightSystem to create the bridge between SWT and draw2D
		final LightweightSystem lws = new LightweightSystem(shell);

		// Create Gauge
		final MeterFigure meterFigure = new MeterFigure();

		// Init gauge
		meterFigure.setBackgroundColor(XYGraphMediaFactory.getInstance()
				.getColor(255, 255, 255));

		meterFigure.setBorder(new SchemeBorder(SchemeBorder.SCHEMES.ETCHED));

		meterFigure.setRange(0, 100);
		meterFigure.setLoLevel(-50);
		meterFigure.setLoloLevel(-80);
		meterFigure.setHiLevel(60);
		meterFigure.setHihiLevel(80);
		meterFigure.setMajorTickMarkStepHint(50);

		lws.setContents(meterFigure);

		// Update the gauge in another thread.
		ScheduledExecutorService scheduler = Executors
				.newScheduledThreadPool(1);
		ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(
				new Runnable() {

					@Override
					public void run() {
						Display.getDefault().asyncExec(new Runnable() {
							@Override
							public void run() {
								meterFigure.setValue(Math.sin(counter++ / 10.0) * 100);
							}
						});
					}
				}, 100, 100, TimeUnit.MILLISECONDS);

		Display display = Display.getDefault();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		future.cancel(true);
		scheduler.shutdown();

	}
}