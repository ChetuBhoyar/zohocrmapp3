package com.springrest.springrest.entities;

public class Course {
private long id;
private String title;
private String description;
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(long id, String title, String description) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", description=" + description + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}
