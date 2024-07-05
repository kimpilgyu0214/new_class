package com.kh.api.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kh.api.model.vo.AirVO;

public class ApiJavaApp {

	
	public static final String SERVICE_KEY = "nbB0L0IV4AlL9S91%2BoEWSs6PLql01tjP6ghzkuCGRdB6awEB%2BJQXze1ddUZf7D5M9%2F%2Fw6CWLBSsXADapG6LHOQ%3D%3D";
	
	public static void main(String[] args) throws IOException{
		
		
		//System.out.println("하이!");
		
		//순수 자바만으로 Client Program을 만들어서 시도별 API서버로 요청 보내고 응답 받기!
		
		// 요청을 보낼 URL 이 필요함! => String 타입으로 보낼 것
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty");
		sb.append("?serviceKey=");
		sb.append(SERVICE_KEY);
		sb.append("&sidoName=");
		sb.append(URLEncoder.encode("서울", "UTF-8"));
		sb.append("&returnType=json");
		
		String url = sb.toString();
		
		//System.out.println(url);
			
		//Java코드를 가지고 URL로 요청을 보낼 것
		//HttpURLConection 객체를 활용해서 API 서버로 요청
		//1. java.net.URL로 객체 생성 => 생성자 호출 시 
		URL requestUrl = new URL(url);
		//2. 생성한 url 객체를 가지고 HttpURLConnection 객체를 생성
		HttpURLConnection urlConnection = (HttpURLConnection)requestUrl.openConnection();
		//3. 요청에 필요한 설정
		urlConnection.setRequestMethod("GET");
		
		urlConnection.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		
		//System.out.println(br.readLine());
		
		
		
		
	/*	String responseXml="";
		while((responseXml = br.readLine()) !=null) {
			System.out.println(responseXml);
		}
		
		*/
		String responseJson = br.readLine();
		//System.out.println(responseJson);
		
		
		
		// 라이브러리
		// JsonObject, JsonArray => 자바데이터 => GSON라이브러리
		// + JsonParser
		
		// JSONObject, JSONArray => 자바 데이터를 => JSON => JSON라이브러리
		
		
		JsonObject jsonObj = JsonParser.parseString(responseJson).getAsJsonObject();
		//System.out.println(jsonObject);
		
		
		JsonObject responseObj = jsonObj.getAsJsonObject("response");
		
		JsonObject bodyObj = responseObj.getAsJsonObject("body");
		
		int totalCount = bodyObj.get("totalCount").getAsInt();
		//int totalCount = bodyObj.get("totalCount").getAsInt();
		//System.out.println(totalCount);
		
		
		JsonArray items = bodyObj.getAsJsonArray("items"); // items property => : [] JsonArray
		//System.out.println(items);
		
		//JsonObject firstItem = items.get(0).getAsJsonObject();
		//System.out.println(firstItem);
		
		
		List<AirVO> list = new ArrayList();
		
		for(int i = 0; i< items.size(); i ++) {
			
			JsonObject firstItem = items.get(i).getAsJsonObject();
		
			AirVO air = new AirVO();
			
			air.setPm10Value(firstItem.get("pm10Value").getAsString());
			air.setStationName(firstItem.get("stationName").getAsString());
			air.setDataTime(firstItem.get("dataTime").getAsString());
			air.setO3Value(firstItem.get("o3Value").getAsString());
			air.setKhaiValue(firstItem.get("khaiValue").getAsString());
			
			list.add(air);
		 
		//System.out.println(air);
		}
	
		
		for(AirVO air : list) {	
			System.out.println(air);
		
		}	
		
		
		
		//자원반납
		
		br.close();
		urlConnection.disconnect();
		
		
		
		
		
		
		
		
		
		
	}
	
}
