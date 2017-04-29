package examples.components;

import javax.jws.WebService;

@WebService
public interface MyJAXWSService {
	String sayGreetings(String name);

}
