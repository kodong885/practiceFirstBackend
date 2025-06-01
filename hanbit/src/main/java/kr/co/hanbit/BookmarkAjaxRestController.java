package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody; // 클라이언트가 HTTP 본문(body)에 담아서 보낸 JSON 데이터를 자바 객체로 바꿔줌.
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController  // 이 클래스는 "REST API"를 처리하는 컨트롤러임을 나타내는 어노테이션;
public class BookmarkAjaxRestController {

    // 북마크 목록을 저장할 리스트 생성, 메모리 안에 저장됨 (DB는 아님!)
    private List<Bookmark> bookmarks = new ArrayList<>();

    // POST 방식으로 "/bookmark" 경로에 요청이 오면 실행되는 메서드;
    @RequestMapping(method = RequestMethod.POST, path = "/bookmark")
    public String registerBookmark(@RequestBody Bookmark bookmark) {
        // 클라이언트에서 JSON으로 받은 데이터를 Bookmark 객체로 변환해서 저장!
        bookmarks.add(bookmark);  // 리스트에 추가;
        return "registered";
    }

    // GET 방식으로 "/bookmarks" 경로에 요청이 오면 실행되는 메서드!
    @RequestMapping(method = RequestMethod.GET, path = "/bookmarks")
    public List<Bookmark> getBookmarks() {
        // 저장된 모든 북마크 목록을 클라이언트에게 반환;
        return bookmarks;  // 리스트 전체를 JSON 형태로 반환;
    }
}
