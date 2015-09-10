package model;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Manager_Class {
	private User1 user;
	private Status status;
	private Todo todo;
	private String message;
    public Manager_Class() {
    }
    
    @PostConstruct
    public void init() {
        user = new User1();
        status = new Status();
        todo = new Todo();
        message="";
    }
    public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Todo getTodo() {
		return todo;
	}

	public void setTodo(Todo todo) {
		this.todo = todo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

 public String getUserDetails()
    {
    	  if (UserDB.emailExists(user.getEmail())) {
    		  System.out.println("Email  found");
              message = "Email Found";
              return "index";
    	  }
    	  else
    	  {
    		  System.out.println("Email not  found");
              message = "Enter Email Again";
              return "index";
    	  }
    	
    }

}
