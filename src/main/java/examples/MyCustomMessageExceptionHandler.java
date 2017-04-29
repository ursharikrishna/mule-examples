package examples;

import org.mule.api.MuleEvent;
import org.mule.api.exception.MessagingExceptionHandler;

public class MyCustomMessageExceptionHandler implements
		MessagingExceptionHandler {

	@Override
	public MuleEvent handleException(Exception exception, MuleEvent event) {
		System.out.println(exception.getMessage());
		return null;
	}

}
