package jeveson.actionprocessor.engine.logger;

import org.springframework.stereotype.Component;

@Component
public class LoggerImpl implements Logger{

	@Override
	public void logDebug(Object cause, String method, String msg) {
		System.out.println(msg);
	}

	@Override
	public void logErro(Object cause, String mETHOD, Exception e) {
		e.printStackTrace();
	}

}
