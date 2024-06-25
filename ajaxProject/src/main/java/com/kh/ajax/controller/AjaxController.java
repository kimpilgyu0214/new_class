package com.kh.ajax.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@ResponseBody
    @GetMapping(value="ajax1.do", produces="text/html; charset=UTF-8")
    public String calSum(@RequestParam String menu, @RequestParam int amount, HttpServletResponse response) throws IOException {
        
        // DB에서 조회된 가격으로 가정
        int price = 0;   
        switch(menu) {
            case "알밥" : price = 10000; break;
            case "돈까스" : price = 12000; break;
            case "서브웨이" : price = 13000; break;
            case "김치찜" : price = 14000; break;
            case "막국수" : price = 15000; break;
        }
        
        price *= amount;
        
        
        
        return String.valueOf(price); 
    }
}
