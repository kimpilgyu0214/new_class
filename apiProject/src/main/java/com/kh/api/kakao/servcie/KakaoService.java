package com.kh.api.kakao.servcie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service
public class KakaoService {

	public String getToken(String code) throws IOException, ParseException {
		
		
		String tokenUrl = "https://kauth.kakao.com/oauth/token";
		URL url = new URL(tokenUrl);
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		
		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		
		
		BufferedWriter bw =
								new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream()));
		
		StringBuilder sb = new StringBuilder();
		sb.append("client_id=6c35fcf6a3c71f8b6a46c65a8e55deb9");
		sb.append("&grant_type=authorization_code");
		sb.append("&redirect_uri=http://localhost/api/oauth");
		sb.append("&code=");
		sb.append(code);
		
		
		bw.write(sb.toString());
		bw.flush();
		
		//System.out.println(urlConnection.getResponseCode());
		
		BufferedReader br = 
								new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
		String line = " ";
		String responseData = " ";
		
		while((line = br.readLine()) != null) {
			responseData += line;
		}
		
		System.out.println(responseData);
		
		JSONParser parser = new JSONParser();
		JSONObject element = (JSONObject)parser.parse(responseData);
		
		String accessToken = element.get("access_token").toString();
		
		br.close();
		bw.close();
		
		return accessToken;
		
	}
	
	public void logout(String accessToken) {
		
		String logoutUrl = "https://kapi.kakao.com/v1/user/logout";
		URL url;
		HttpURLConnection conn;
		
		try {
			url = new URL(logoutUrl);
			conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", "Bearer" + accessToken);
			
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(conn.getInputStream()));

				String line = " ";
				String responseData = " ";
				
				while((line = br.readLine()) != null) {
				responseData = line;
				}
				
				System.out.println(responseData);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void getUserInfo(String accessToken) {
		
		String userInfoUrl = "	https://kapi.kakao.com/v2/user/me";
		
		try {
			URL url = new URL(userInfoUrl);
			HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
			urlConnection.setRequestMethod("GET");
			urlConnection.setRequestProperty("Authorization", "Bearer" + accessToken);
		}
	
	
	
	}	
}
