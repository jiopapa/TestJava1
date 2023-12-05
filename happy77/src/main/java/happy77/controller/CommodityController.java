package happy77.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import happy77.service.ApiService;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/{symbol}")
    public String getCommodityPrice(@PathVariable String symbol, Model model) {
        String commodityPrice = apiService.getCommodityPrice(symbol);
        model.addAttribute("commodityPrice", commodityPrice);
        return "commodity";
    }
    @GetMapping("/page")
    public String showCommodityPage(Model model) {
        // 여기에서 모델에 필요한 데이터를 추가할 수 있습니다.
        return "commodity"; // HTML 파일의 이름 (확장자는 생략)
    }
}