//package com.alibaba.taobao.Dao;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class SecurityUserDetails implements UserDetails{
//
//
//	private User user;
//
//	public SecurityUserDetails(User user) {
//		 super();
//	     this.user = user;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		SimpleGrantedAuthority authority1 = new SimpleGrantedAuthority("1");
//		SimpleGrantedAuthority authority2 = new SimpleGrantedAuthority("2");
//		return Arrays.asList(authority1, authority2);
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		System.out.println("password   "+user.getPassword());
//		return user.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		System.out.println("username  "+ user.getCreateTime());
//		return user.getUsername();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
