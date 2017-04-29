package examples.components;

public class SimpleServiceImpl implements SimpleService{

	@Override
	public String sayGreetings(String name) {		
		return "Hello"+name+", Welcome to SOAP WS world";
	}

}
