package login;

import java.io.Serializable;

public  class User implements Serializable{
	
	private int id;
	private static int nextId = 1;
	
	public User() {
		this.id=nextId++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}
	

}
