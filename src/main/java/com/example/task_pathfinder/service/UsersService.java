package com.example.task_pathfinder.service;

import org.springframework.stereotype.Service;

import com.example.task_pathfinder.dto.UsersDTO;
import com.example.task_pathfinder.entity.Users;
import com.example.task_pathfinder.repository.UsersRepository;

/**
 * Usersテーブルサービスクラス
 */
@Service
public class UsersService {
	private final UsersRepository usersRepository;
	
	// userRepositoryインスタンスを注入
	public UsersService(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}
	
	// ユーザー情報をデータベースに保存する処理
	public void saveUser(UsersDTO usersDTO) {
		String email = usersDTO.getEmail();
		Users existingUsers = usersRepository.findByEmail(email);
		if (existingUsers != null) {
			existingUsers.setName(usersDTO.getName());
			existingUsers.setEmailVerified(usersDTO.getEmailVerified());
			existingUsers.setUid(usersDTO.getUid());
			existingUsers.setUpdatedBy(usersDTO.getName());
			usersRepository.save(existingUsers);
		} else {
			Users users = new Users();
			users.setName(usersDTO.getName());
			users.setEmail(usersDTO.getEmail());
			users.setEmailVerified(usersDTO.getEmailVerified());
			users.setUid(usersDTO.getUid());
			users.setCreatedBy(usersDTO.getName());
			users.setUpdatedBy(usersDTO.getName());
			usersRepository.save(users);
		}
	}
	
	// emailアドレスの情報からuserテーブル情報を取得
	public UsersDTO getUserByEmail(String email) {
		// Usersテーブルからemailアドレスでidを取得する処理
		Users users = usersRepository.findByEmail(email);
		return convertToDto(users);
	}
	
	/**
	 * 
	 */
	private UsersDTO convertToDto(Users users) {
		UsersDTO usersDTO = new UsersDTO();
		usersDTO.setId(users.getId());
		usersDTO.setName(users.getName());
		usersDTO.setEmail(users.getEmail());
		usersDTO.setEmailVerified(users.getEmailVerified());
		usersDTO.setUid(users.getUid());
		return usersDTO;
	}
}
