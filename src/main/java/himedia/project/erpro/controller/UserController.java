package himedia.project.erpro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import himedia.project.erpro.dto.Password;
import himedia.project.erpro.dto.Profile;

@RestController
public class UserController {

	// 메인페이지
	@GetMapping("/home")
	public String home() {
		return "데이타";
	}

	// 회원정보 수정폼 - 이지홍
	@GetMapping("/profile")
	public Profile profile() {
		Profile profile = new Profile("이미자", "111111", "1969-04-23", "010-8888-7777", "mija@gmail.com", "영업", "부장",
				"2010-10-23");
		return profile;
	}

	// 회원정보 수정 - 이지홍
	@PutMapping("/profile")
	public String editProfile(@RequestBody Profile profile) {
		System.out.println(profile.getName());
		System.out.println(profile.getId());

		return "redirect:/profile";
	}

	// 비밀번호 수정 - 이지홍
	@PutMapping("/password")
	public String editProfile(@RequestBody Password password) {

		return "redirect:/profile";
	}
}
