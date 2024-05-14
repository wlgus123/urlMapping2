package hs.kr.study.urlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller     // Component + @RequestMapping     bean을 생성해서 컨테이너에 보관하면서 라우터 기능
public class HomeController {
    //    /로 GET방식으로 접속했을 때 index.html이 실행됨
    @GetMapping("/")
    public String home() {
        return "index";  // 자동으로 index.html이 됨
    }
    // root로, get 방식으로 접속했을 때 index.html을 실행해라
}
