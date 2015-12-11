package soa.eip;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Router extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:search")
			.to("twitter://search?consumerKey=Rs3hb4qSYa9feoSQK0SMhvUXc&"
					+ "consumerSecret=DGMKnwYLdf8D4OaJyWgrZbP6gLP7FvirPrFq4xyITOpxCfgQ52&"
					+ "accessToken=1732307449-NB0Q9X2W1cSggDWV8pyuuwqQPVXZQzvLIIdVqQE&"
					+ "accessTokenSecret=NezykxsHge3Ywm9rEgTZIWghuQJ5VSLhZ1YLAKA2rtOOs");
	}

}
