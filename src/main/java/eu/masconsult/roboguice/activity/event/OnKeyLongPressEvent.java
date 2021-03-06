package eu.masconsult.roboguice.activity.event;

import android.view.KeyEvent;

public class OnKeyLongPressEvent {

	protected int keyCode;
	protected KeyEvent event;
	protected boolean handled;

	public OnKeyLongPressEvent(int keyCode, KeyEvent event) {
		this.keyCode = keyCode;
		this.event = event;
	}

	public int getKeyCode() {
		return keyCode;
	}

	public KeyEvent getEvent() {
		return event;
	}

	public void setHandled() {
		this.handled = true;
	}

	public boolean isHandled() {
		return handled;
	}
}
