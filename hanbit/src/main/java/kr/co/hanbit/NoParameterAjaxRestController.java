package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 7-3-1.html 코드이용!!
@RestController
public class NoParameterAjaxRestController {

    @RequestMapping("/get-with-no-parameter")
    public String getWithNoParameter() {
        return  "파라미터 없는 GET 요청";
    }
}
