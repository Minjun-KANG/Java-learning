package example13_1;
import java.awt.*; //GUI 담당부분
import javax.swing.*; //GUI 담당부분 awt 상위호환 J가 붙은건 swing 모듈이다.

class TimerThread extends Thread {
	private JLabel timerLabel;
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

