package happy77.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ApiService {

    @Value("${alphavantage.api.key}")
    private String apiKey;

    public String getCommodityPrice(String symbol) {
        String url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + symbol + "&apikey=" + apiKey;

        WebClient webClient = WebClient.create();
        Mono<String> result = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class);

        return result.block(); // 실제로는 block()을 사용하지 않는 것이 좋습니다. Reactor의 비동기 특성을 활용하세요.
    }
}
