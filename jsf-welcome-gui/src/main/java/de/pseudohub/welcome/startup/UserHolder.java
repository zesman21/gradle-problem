package de.pseudohub.welcome.startup;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import de.pseudohub.welcome.auth.User;

@Startup
@Singleton
public class UserHolder {

	private User user;
	
	public void init() {
		this.user = new User("test", "test");
	}
}
