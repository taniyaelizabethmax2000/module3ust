package com.ust.ioc;
//responsibility to validate whether username is present in database or not.
public class Login {
    private String userName;
    private String password;
    DBConnection db;//see this as dependency
    
    
    public DBConnection getDb() {
		return db;
	}



	public void setDb(DBConnection db) {
		this.db = db;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}

//spring cannot use userdefined methods for injection

	public void setPassword(String password) {
		this.password = password;
	}



	public String validate() {
    	//obtain connection to database  and writes sql
    	//to verify userName and password exist
    	//in database
    	// db =  new DBConnection();//without this it cannot connect to cloud
  // return true;//true means connected false means not connected.
       Connection con   =db.getConnection();
    	return "Login validated.....";
    }
}
