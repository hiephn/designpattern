package com.ntv.callback;

public abstract class Task {
	public abstract void execute();
	
	public final void executeWith(Callback callback){
		execute();
		if (callback != null) {
			callback.call();
		}
	}
}
