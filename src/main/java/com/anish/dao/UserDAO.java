package com.anish.dao;

import java.util.List;

import com.anish.model.User;

public interface UserDAO 
{
	public boolean addUser(User user);
	public boolean deleteUser(User user);
	public boolean updateUser(User user);
	public List<User> displayUsers();
	public User displayUser(int userid);
	public User displayUserByName(String username);
}
