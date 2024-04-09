package com.example.task_pathfinder.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.task_pathfinder.dto.UsersDTO;
import com.example.task_pathfinder.service.UsersService;

/*
 * UsersテーブルController 
 */
@RestController
public class UsersController {
	private final UsersService usersService;
	
	/**
	 * Spring Bootでは、コンストラクタに@Autowiredアノテーションが付けられている場合、
	 * Springが自動的にBeanをインジェクションするので@Autowiredはここには不要である。
	 * @param usersService
	 */
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@PostMapping("api/userInfo")
	public void userInfo(@RequestBody UsersDTO UsersDTO) {
		usersService.saveUser(UsersDTO);
	}
	
	@GetMapping("api/getUserByEmail")
	public ResponseEntity<Map<String, Integer>> getUserByEmail(@RequestParam("email") String email) {
		UsersDTO usersDTO = usersService.getUserByEmail(email);
		if(usersDTO != null) {
			Map<String, Integer> response = new HashMap<>();
			response.put("id", usersDTO.getId());
			return ResponseEntity.ok(response);
		} else {
			// userIdがnullの場合、クライアントにエラーを通知する
			return ResponseEntity.notFound().build();
		}
	}
}
