package com.example.task_pathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task_pathfinder.entity.Users;

//エンティティの型に合わせて第二引数を変更する必要があります。
//基本的なCRUD操作のみ
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	Users findByEmail(String email);
}
