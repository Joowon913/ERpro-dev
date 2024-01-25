package himedia.project.erpro.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import himedia.project.erpro.dto.Password;
import himedia.project.erpro.dto.Profile;
import himedia.project.erpro.entity.User;
import himedia.project.erpro.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
	// 사원 대장 - 김주원
	@GetMapping("/user")
	public String user() {
		return "사원 대장";
	}
	
	// 사원 추가 - 김주원
	@PostMapping("/user")
	public String addUser(@RequestBody User user) {
		System.out.println("사번 : " + user.getId());
		System.out.println("비밀번호 : " + user.getPassword());
		System.out.println("이름 : " + user.getName());
		System.out.println("생년월일 : " + user.getBirth());
		System.out.println("연락처 : " + user.getPhone());
		System.out.println("이메일 : " + user.getEmail());
		System.out.println("부서 : " + user.getDepartment());
		System.out.println("직책 : " + user.getUserRank());
		System.out.println("입사일 : " + user.getInsertDate());
		return "사원 추가";
	}
	
	// 사원 수정 - 김주원
	@PutMapping("/user")
	public String editUser(@RequestBody User user) {
		System.out.println("이메일 : " + user.getEmail());
		System.out.println("직책 : " + user.getUserRank());
		System.out.println("연락처 : " + user.getPhone());
		return "사원 정보 수정";
	}
	
	// 사원 삭제 - 김주원
	@DeleteMapping("/user")
	public String deleteUser(@RequestParam(name="id") long id) {
		System.out.println("사번 : " + id);
		return "사원 삭제";
	}
	
	// 회원정보 수정폼 - 이지홍
	@GetMapping("/profile")
	public Profile profile() {
		// 유저정보와 일치하는 유저데이터 받아오기
		Long userId = 1L;
		Profile profile = new Profile("이미자", "111111", "1969-04-23", "010-8888-7777", "mija@gmail.com", "영업", "부장", "2010-10-23");
		Optional<User> user = userService.getUserById(userId);
		if(user.isPresent()) {
			//User to Profile
		}
		return profile;
	}

	// 회원정보 수정 - 이지홍
	@PutMapping("/profile")
	public String putProfile(@RequestBody Profile profile) {
		// 첫번째 파라미터 userid로 바꾸기
		userService.updateProfile(1l, profile);
		return "redirect:/profile";
	}

	// 비밀번호 수정 - 이지홍
	@PutMapping("/password")
	public String putPassword(@RequestBody Password password) {
		// 첫번째 파라미터 userid로 바꾸기
		userService.updatePassword(1l, password);
		return "redirect:/profile";
	}
}
