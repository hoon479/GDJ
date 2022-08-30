package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import java.util.List;











public class ApiMain {
	
	public static void m1() {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
		
		String serviceKey = "BkCQazv1gJwLqA+jlsqdRpogyM0InfDsICHdfKYTGI06cB/0RGcz2l3kagWbKyXviKipbHFwvfPIQ5ARXIKuVA==";
		
		
		try {      
		
			
		         urlBuilder.append("?ServiceKey=" + URLEncoder.encode(serviceKey,"UTF-8"));
		         urlBuilder.append("&searchYear=2021");
		         urlBuilder.append("&siDo=1100");
		         urlBuilder.append("&guGun=1125");
		         urlBuilder.append("&type=" + URLEncoder.encode("json","UTF-8"));
		         urlBuilder.append("&numOfRows=10");
		         urlBuilder.append("&pageNo=1");
		         urlBuilder.append("&resultCode=0000");
		         urlBuilder.append("&resultMsg=" + URLEncoder.encode("Success", "UTF-8"));
		         urlBuilder.append("&acc_year=2021");
		         urlBuilder.append("&occrrnc_dt=2019011622");
		         urlBuilder.append("&dght_cd=2");
		         urlBuilder.append("&occrrnc_day_cd=4");
		         urlBuilder.append("&dth_dnv_cnt=0");
		         urlBuilder.append("&injpsn_cnt=1");
		         urlBuilder.append("&se_dnv_cnt=1");
		         urlBuilder.append("&sl_dnv_cnt=0");
		         urlBuilder.append("&wnd_dnv_cnt=0");
		         urlBuilder.append("&occrrnc_lc_sido_cd=1100");
		         urlBuilder.append("&occrrnc_lc_sgg_cd=1125");
		         urlBuilder.append("&acc_ty_lclas_cd=02");
		         urlBuilder.append("&acc_ty_mlsfc_cd=23");
		         urlBuilder.append("&acc_ty_cd=23");
		         urlBuilder.append("&aslt_vtr_cd=01");
		         urlBuilder.append("&road_frm_lclas_cd=01");
		         urlBuilder.append("&road_frm_cd=04");
		         urlBuilder.append("&wrngdo_isrty_vhcty_lclas_cd=01");
		         urlBuilder.append("&dmge_isrty_vhcty_lclas_cd=01");
		         urlBuilder.append("&occrrnc_lc_x_crd=943817");
		         urlBuilder.append("&occrrnc_lc_y_crd=1945678");
		         urlBuilder.append("&lo_crd=128.45275545");
		         urlBuilder.append("&la_crd=35.94815032");
		         urlBuilder.append("&totalCount=19");
		         urlBuilder.append("&numOfRows=10");
		         urlBuilder.append("&pageNo=1");


			
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 실패");
		}
		
		String apiURL = urlBuilder.toString();
		
		
		URL url = null;
		HttpURLConnection con = null;
		
		try {			
			url = new URL(apiURL);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		} catch(MalformedURLException e) {
			System.out.println("API 주소 오류");
		} catch(IOException e) {
			System.out.println("API 접속 실패");
		}
		
		
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb);
			
			reader.close();
			
		} catch(IOException e) {
			System.out.println("API 응답 실패");
		}
		
		
		String response = sb.toString();
		
		
		File file = new File("c:\\storage","accident.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(response);
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		  
		
		}
	
	
	
	public static void main(String[] args) {
		m1();
	}
}
	
		
	
		
			
		

		
		
	
	
	
	
		
	





