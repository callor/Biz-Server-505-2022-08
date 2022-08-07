package com.callor.todo.controller.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserVO implements UserDetails { // extends User {

	private static final long serialVersionUID = 1L;

	private long id;
	private String username;
	private String password;
	private boolean isEnabled;
	private boolean isAccountNonExpired;
	private boolean isAccountNonLocked;
	private boolean isCredentialsNonExpired;
	private Collection<? extends GrantedAuthority> authorities; // getAuthorities

	private String email;
	private String phone;
	private String address;
	
	private String realname;
	private String nickname;


}
