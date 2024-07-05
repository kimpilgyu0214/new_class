package com.kh.api.pollution.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("air-pollution")
public class AirController {
	
	
	public static final String SERVICE_KEY = "nbB0L0IV4AlL9S91%2BoEWSs6PLql01tjP6ghzkuCGRdB6awEB%2BJQXze1ddUZf7D5M9%2F%2Fw6CWLBSsXADapG6LHOQ%3D%3D";
	
	
	@GetMapping(produces="application/json; charset=UTF-8")
	public String airPollution(String sidoName) throws IOException {
		
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty");
		sb.append("?serviceKey=");
		sb.append(SERVICE_KEY);
		sb.append("&sidoName=");
		sb.append(URLEncoder.encode(sidoName, "UTF-8"));
		sb.append("&returnType=json");
		
		String url = sb.toString();
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection)requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		urlConnection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		
		String responseData = br.readLine();
		
		br.close()	;
		urlConnection.disconnect()	;
		
		
		return responseData;
		
	}

	
	@GetMapping(value="/xml", produces="text/html; charset=UTF-8")
	public String xmlPollution(String sidoName) throws IOException {
		
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty");
		sb.append("?serviceKey=");
		sb.append(SERVICE_KEY);
		sb.append("&sidoName=");
		sb.append(URLEncoder.encode(sidoName, "UTF-8"));
		sb.append("&returnType=json");
		
		String url = sb.toString();
		URL requestUrl = new URL(url);
		HttpURLConnection urlConnection = (HttpURLConnection)requestUrl.openConnection();
		urlConnection.setRequestMethod("GET");
		urlConnection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		
		String responseData = "";
		String line;
		
		while((line = br.readLine()) != null) {
			responseData += line;
		}
		
		br.close()	;
		urlConnection.disconnect()	;
		
		
		return responseData;
	}
}