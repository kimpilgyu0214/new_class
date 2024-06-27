package com.kh.ajax.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.kh.ajax.model.vo.Menu;

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
	
	
	
	
	@ResponseBody
	@GetMapping(value="ajax2.do" ,produces = "application/json, charset=UTF-8" )
	public String selectMenu(int menuNumber) {
		
		/*
		 * 요청처리를 잘 했다는 가정하에
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Menu menu = new Menu(1, "순두부",9500,"순두부");
		/*
		StringBuilder sb = new StringBuilder();
		
		
		sb.append("{");
		sb.append("\"menuNumber\" : " + "'" + menu.getMenuNumber());
		sb.append("\"menuName\" : " + "'" + menu.getMenuName());
		sb.append("\"menuPrice\" : " + "'" + menu.getPrice());
		sb.append("\"material\" : " + "'" + menu.getMaterial());
		sb.append("}");
		*/
		
		
		//return sb.toString();
		
		JSONObject jObj = new JSONObject();
		jObj.put("menuNumber" , menu.getMenuNumber());
		jObj.put("menuName" , menu.getMenuName());
		jObj.put("menuPrice" , menu.getPrice());
		jObj.put("material" , menu.getMaterial());
		
		return jObj.toJSONString();
		
		
	}
	
	
	@ResponseBody
	@GetMapping(value = "ajax3.do", produces="application/json; charset=UTF-8")
	public Menu ajax3Method(int menuNumber) {
		Menu menu = new Menu(menuNumber, "순두부찌개", 9500, "순두부찌개");
		
		
		return menu;
	}
	
	
	
	@ResponseBody
	@GetMapping(value = "find.do", produces="application/json; charset=UTF-8")
	public String findAll() {
		
		
		List<Menu> menus = new ArrayList();
		menus.add(new Menu(1, "순두부찌개", 9500, "순두부찌개"));
		menus.add(new Menu(1, "웅찌개", 13000, "웅찌개"));
		menus.add(new Menu(1, "두찌개", 5500, "두찌개"));

		
		
		
		
		/*
		 * { 
		 * 	menuNumber : 1,
		 * 	menuName : "순두부찌개",
		 *  price : 9500,
		 *  material : "순두부"
		 *  }
		 * 
		 * 
		 */
		
		
		JSONArray jArr = new JSONArray ();

		
		
		return new Gson().toJson(menus);
		
	}

	
	
	
	
}
