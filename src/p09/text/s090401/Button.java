package p09.text.s090401;
public class Button {
	OnClickListener listener;
	void setOnClickListener(OnClickListener listener) {
		this.listener.onClick();
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
