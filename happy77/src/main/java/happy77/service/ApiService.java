package happy77.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
	 @Value("${alphavantage.api.key}")
	    private String apiKey;

}
