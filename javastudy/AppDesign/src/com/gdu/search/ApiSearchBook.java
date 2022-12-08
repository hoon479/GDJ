package com.gdu.search;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;



public class ApiSearchBook {
	
	public static void main(String[] args) {
		
		
		String clientId = "V6JXYuVnYeLv8zR7ZE_M";
		String clientSecret = "R4RDqUYkON";
		
		Scanner sc = new Scanner(System.in); 
	
		
		try {
			
			String apiURL = "https://openapi.naver.com/v1/search/book?query=" + "책검색";
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			BufferedReader br = null;
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			con.disconnect();
			
			JSONObject obj = new JSONObject(sb.toString());
			JSONArray arr = new JSONArray(obj);
			
			File dir = new File("C:/download");
			if(dir.exists() == false) {
				dir.mkdirs();
			}
			File file = new File(dir, "C:/download" + "자바.html");
			PrintWriter out = new PrintWriter(file);
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>검색결과</title>");
			out.println("</head>");
			out.println("<body>");
			JSONObject object = new JSONObject();
			JSONObject title = object.getJSONObject("title");
			JSONObject link = title.getJSONObject("link");
			JSONObject images = link.getJSONObject("images");
			JSONArray image = images.getJSONArray("image");
			for(int i = 0; i < image.length(); i++) {
				JSONObject element = image.getJSONObject(i);
				System.out.println(element.getString("category") + " : " + element.getString("book"));
			}
			
			out.println("</body>");
			out.println("</html>");
			out.close();
			
			System.out.println("응답 성공");
			
		} catch(Exception e) {
			
			try {
				
				File dir = new File("C:/download/log");
				if(dir.exists() == false) {
					dir.mkdirs();
				}
				File file = new File(dir, "error_log.txt");
				PrintWriter out = new PrintWriter(file);
				out.println("응답 실패");
				out.close();
				
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
