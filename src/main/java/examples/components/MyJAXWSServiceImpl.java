package examples.components;

public class MyJAXWSServiceImpl implements MyJAXWSService {

	@Override
	public String sayGreetings(String name) {
		return "Welcome"+name;
	}

}
