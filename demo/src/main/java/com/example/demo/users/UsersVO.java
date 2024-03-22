package com.example.demo.users;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UsersVO {
	private String userid;
	private String userpw;
	private String grade;
	

}
