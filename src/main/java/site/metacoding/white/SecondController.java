package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// 데이터 받기
// GET -> http body가 없음 -> QueryString, PathVariable(PK) -> Form(GET) -> 브라우저 (주소뒤 ? 붙이기)
// POST, PUT -> http body 담아준다. -> Form(POST)
// DELETE -> http body가 없음 -> QueryString, PathVariable(PK)

@RestController
public class SecondController {
	
	@GetMapping("/second/{id}") //PK(id)가 1인 걸 찾고 싶다
	public String getDate(@PathVariable Integer id) {
		return "id: "+id;
	}
	
	// QueryString = ﻿x-www-form-urlencoded﻿ 타입이다.
	@GetMapping("/second")
	public String getDate2(String title, String content) {
		return "title: "+title+"content: "+content;
	}
	
	// 주소에 담아 보내는 건 타입이 쿼리스트링 하나 뿐이지만
	// 바디에 담아서 보내는 건 종류가 너무 많다.
	// 그래서 꼭 알려줘야 한다.
	//BR -> title=제목&content=내용, ﻿Content-Type﻿
	@PostMapping("/second")
	public String postDate(String title, String content) { // 스프링 파싱 기본전략: x-www-form-urlencoded
		return "title: "+title+"content: "+content;
	}
	
	@PutMapping("/second")
	public String putDate(String title, String content) { // 스프링 파싱 기본전략: x-www-form-urlencoded
		return "title: "+title+"content: "+content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteDate(@PathVariable Integer id) { // 스프링 파싱 기본전략: x-www-form-urlencoded
		return "delete ok";
	}
}
