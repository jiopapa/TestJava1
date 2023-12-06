package happy77.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class CommodityController {

    @Value("${alphavantage.api.key}")
    private String apiKey;

    @GetMapping("/getCommodityData")
    public String getCommodityData(Model model) {
        String symbol = "WTI";
        String url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol="+symbol+"&apikey="+apiKey;

        RestTemplate restTemplate = new RestTemplate();
        String commodityData = restTemplate.getForObject(url, String.class);

        model.addAttribute("commodityData", commodityData);
        
        return "thymeleaf/commodity"; // HTML 파일의 이름 (확장자는 생략)
    }
}
