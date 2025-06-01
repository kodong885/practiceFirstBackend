package kr.co.hanbit;

import org.springframework.web.bind.annotation.RestController; // 이 클래스가 REST API 컨트롤러임을 나타냄
import org.springframework.web.bind.annotation.RequestMapping; // HTTP 요청을 어떤 메서드가 처리할지 매핑하는 어노테이션
import org.springframework.web.bind.annotation.RequestParam;   // 요청 파라미터를 메서드 인자로 받을 때 사용

@RestController  // 이 클래스는 REST API의 컨트롤러라는 의미.
public class SimpleRestController {

    @RequestMapping("/")
    public String hello() {
        return "'/' 여기로 들어온듯 ㅋ";
    }

    @RequestMapping("/other")
    public String hi() {
        return "'/other' 여기로 들어온듯ㅋ  우와 <strong>신난다</strong>"; // HTML 태그도 문자열에 포함 가능함 ㅋ
    }

    @RequestMapping("/article")
    public String createArticle(@RequestParam("title") String title,
                                @RequestParam("content") String content) {
        // 요청에서 title과 content라는 이름의 파라미터를 받아와서, 문자열로 응답함
        return String.format("title=%s / content=%s", title, content);
    }
}
