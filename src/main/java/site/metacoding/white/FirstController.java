package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// Http Method -> Mapping 기술
// GET -> 주소창, 하이퍼링크
// POST -> form 태그
// PUT, DELETE, GET, POST ->JS (자바스크립트)

// 포스트맨 -> 4가지 요청을 쉽게 테스트 해볼 수 있다.
@RestController // data를 응답 
// 굳이 controller 걸 필요가 없다.
public class FirstController {
	
	@GetMapping("/first")
	public String getDate() {
		return "<h1>data</h1>";
	}
	
	@PostMapping("/first")
	public String postDate() {
		return "<h1>insert data</h1>";
	}
	
	@PutMapping("/first")
	public String putDate() {
		return "<h1>update data</h1>";
	}
	
	@DeleteMapping("/first")
	public String deleteDate() {
		return "<h1>delete data</h1>";
	}
}
