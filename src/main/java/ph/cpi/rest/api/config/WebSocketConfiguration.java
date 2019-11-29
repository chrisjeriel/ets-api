package ph.cpi.rest.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/extractionLog",
							 "/telegram",
							 "/notifications",
							 "/moduleSecurity")
				.setAllowedOrigins("*")
				.withSockJS();
	}
	
	@Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app")
                .enableSimpleBroker("/prodLogs", "/osLogs",
                					"/chat",
                					"/alert",
                					"/pol-issuance",
                					"/pol-alteration",
                					"/pol-oc",
                					"/quote-processing",
                					"/clm-processing");
    }
	
	


}
