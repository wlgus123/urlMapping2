package hs.kr.study.urlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sub")
public class TestController {
    // test1로 접속했을 때 Welcome 출력
//    @GetMapping("/test1")
//    @ResponseBody  // view template를 거치지 않고 http의 body에 입력되어 전송
//    public String test1() {
//        return "test1의 get 요청 연습하기";
//    }
    
    // sub/test2로 접속하면 sub/test2.html 실행
    @GetMapping("test2")  // sub/test2
    public String test2() {
        return "sub/test2";
    }

    // sub/test3로 접속하면 sub/test3.html 실행
    @GetMapping("test3")  // sub/test3
    public String test3() {
        return "sub/test3";
    }

    @PostMapping("test4")
    public String test4() {
        return "sub/test4";
    }

}
