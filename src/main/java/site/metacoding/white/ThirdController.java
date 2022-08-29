package site.metacoding.white;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

// 고급 데이터 받기 (json, x-www-form-머시기, text)

@RestController
public class ThirdController {

	@PostMapping("/third")
	public String postData(Third third) { //object 그대로 적음
		return "id: "+ third.getId()+",title: "+third.getTitle()+",content: "+third.getContent();
	}
	
	// UPDATE thrid SET title = ?, content = ? WHERE id = ?
	@PutMapping("/third/{id}")
	public String putDate(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	@PutMapping("/third/{id}/json")
	public String putJsonDate(@PathVariable Integer id, @RequestBody  Third third) {
		return third.toString();
	}
}
