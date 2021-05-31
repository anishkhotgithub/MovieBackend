package com.anish.MovieBackend;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.anish.config.AppConfig;
import com.anish.dao.UserDAO;
import com.anish.model.User;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class AppTest 
{
	@Autowired
    UserDAO userDAO;
    
    @Test
    public void addUserTest()
    {
        assertTrue(userDAO.addUser(new User("Anish","Pass@123","anishkhot@gmail.com")));
    }
    
    @Test
    @Ignore
    public void deleteUserTest()
    {
    	User u=new User();
    	u.setUserid(1);
        assertTrue(userDAO.deleteUser(u));
    }
    
    @Test
    @Ignore
    public void updateUserTest()
    {
    	User u=userDAO.displayUser(2);
    	u.setUsername("Sahil1234");
    	
        assertTrue(userDAO.updateUser(u));
    }
    
    @Test
    @Ignore
    public void displayUsersTest()
    {
    	assertNotNull(userDAO.displayUsers());
    }
    
    
    @Test
    @Ignore
    public void displayUserById()
    {
    	assertNotNull(userDAO.displayUser(1));
    }
}

