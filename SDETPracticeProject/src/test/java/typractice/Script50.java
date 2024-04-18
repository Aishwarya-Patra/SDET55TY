package typractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Script50 {
	public static void main(String[] args) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
	}

}
