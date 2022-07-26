package com.gdu.app01.java01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
  	@Configuration
  	안녕, 난 Bean을 만드는 Java 파일이야
  	Spring Bean COnfiguration File하고 하는 일이 같지.
  
  
 */

@Configuration
public class SpringBeanConfig {

	// 메소드 하나당 Bean 하나를 맡아서 생성한다. 
	
	/*
	   @Bean
	   안녕 난 Bean을 만드는 메소드야
	   메소드 이름이 Bean의 이름(id)이고,
	   반환타입이 Bean의 타입(class)야
	 */
	
	/*
		<bean id="song1" class="Song1">
			<property name="title" value="제목1" />
			<property name="genre" value="장르1" />
		</bean>
	 
    */
	
	@Bean
	public Song song1() {
		Song song = new Song();
		song.setTitle("제목1");
		song.setGenre("장르1");
		return song;
	}
	
	/*
	<bean id="song2" class="Song2">
		<property name="title" value="제목2" />
		<property name="genre" value="장르2" />
	</bean>
 
*/

   @Bean(name="song2")		// @Bean에 name값을 저장하면 id로 사용된다.
  public Song asdfgjk() {	// 메소드 이름은 아무거나 적어도 된다.
	Song song = new Song();
	song.setTitle("제목2");
	song.setGenre("장르2");
	return song;
}
   
   /*
	<bean id="song3" class="Song3">
		<property name="title" value="제목3" />
		<property name="genre" value="장르3" />
	</bean>

*/

  @Bean
  public Song song3() {
	  return new Song("제목3", "장르3");
}
  // 미션
  
  // song1를 가지는 singer1을 만들어 보자
  // setter injection
  
  @Bean
  public Singer singer1() {
     Singer singer = new Singer();
     singer.setName("가수1");
     singer.setSong(song1());
     return singer;
  }
  
  
  // song2를 가지는 singer2을 만들어 보자
  // setter injection
  
  @Bean(name="singer2")
  public Singer qdse() {
     Singer singer = new Singer();
     singer.setName("가수2");
     singer.setSong(asdfgjk());
     return singer;
  }
  
  // song3를 가지는 singer3을 만들어 보자
  // setter injection
  
  @Bean
  public Singer singer3() {
     return new Singer("가수3", song3());
  }
  
}
  

