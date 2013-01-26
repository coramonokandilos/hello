package com.ponta027.logwatcher.core;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.StartDocument;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;

/**
 * ログファイルTailクラス ログファイルパス、マッチング条件を保持する。
 * 
 * 
 * @author kazuhiro
 * 
 */
public class LogTailer implements Runnable {

	/** ログファイルパス */
	private String logFile;
	private final IDocumentWriter writer;
	private boolean stop;
	
	/** */
	private IErrorCheckStrategy strategy;
	
	public IErrorCheckStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IErrorCheckStrategy strategy) {
		this.strategy = strategy;
	}

	public boolean isStop() {
		return stop;
	}

	public synchronized void setStop(boolean stop) {
		if(!stop){
			notify();
		}
		this.stop = stop;
	}

	public LogTailer(IDocumentWriter writer) {
		this.writer = writer;
	}

	/**
	 * @throws IOException
	 * 
	 */
	private long watchLogFile(String filepath, long seek) throws IOException {
		List<IStatus> statusList = new ArrayList<IStatus>();
		System.out.println("watchLog");
		File file = new File(filepath);
		RandomAccessFile access = new RandomAccessFile(file, "r");
		access.seek(seek);
		String line;
		while ((line = access.readLine()) != null) {
			// System.out.println(line);
			writer.write(line);
			IStatus check = strategy.check(line);
			if(check!=null && !check.isOK()){
				statusList.add(check);
			}
		}
		if(statusList.size()>0){
		MultiStatus multiStatus = new MultiStatus("TEST",01, statusList.toArray(new IStatus[0]), "", null);
		strategy.report(multiStatus);
		}
		long filePointer = access.getFilePointer();
		access.close();
		return filePointer;
	}

	
	public String getLogFile() {
		return logFile;
	}

	public void setLogFile(String logFile) {
		this.logFile = logFile;
	}

	@Override
	public void run() {
		long seek = 0;
		while (true) {
			try {

				seek = watchLogFile(logFile, seek);
				if (seek == 0) {
					return;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {

				Thread.sleep(1000 * 10);
				synchronized (this) {
					if(stop){wait();}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				break;
			}
		}

	}
}
