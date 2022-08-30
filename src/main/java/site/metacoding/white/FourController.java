package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus.Series;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourController {
	
	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; // DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
	}
	// 이렇게 리턴하는 사람은 없다
	
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response;
		return new ResponseEntity<>(four, HttpStatus.CREATED); 
		// DS가 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달
	}
	
	@GetMapping("/four/dto")
	public RespDto<?> getData3() { 
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(-1, "데이터가 DB에 없어", null) ; 
	}
	
}
