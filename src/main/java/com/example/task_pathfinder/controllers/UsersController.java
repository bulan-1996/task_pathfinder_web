package com.example.task_pathfinder.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
}
