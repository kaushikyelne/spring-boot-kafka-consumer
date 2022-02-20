package com.example.demo.model;

public class User {


	    private String name;
	    private String dept;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDept() {
	        return dept;
	    }

	    public void setDept(String dept) {
	        this.dept = dept;
	    }

	    public User() {
	    }

	    public User(String name, String dept) {

	        this.name = name;
	        this.dept = dept;
	    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("User [name=");
			builder.append(name);
			builder.append(", dept=");
			builder.append(dept);
			builder.append("]");
			return builder.toString();
		}

	    
	    
}
