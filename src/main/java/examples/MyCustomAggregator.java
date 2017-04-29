package examples;

import org.mule.api.MuleContext;
import org.mule.routing.AbstractAggregator;
import org.mule.routing.correlation.EventCorrelatorCallback;

public class MyCustomAggregator extends AbstractAggregator {

	@Override
	protected EventCorrelatorCallback getCorrelatorCallback(
			MuleContext muleContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
