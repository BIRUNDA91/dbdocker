package com.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private int age;
private String gender;
private int salary;
public void setId(int i)
{
	id=i;
}
public int getId()
{
	return id;
}
public void setName(String n)
{
	name=n;
}
public String getName()
{
	return name;
}
public void setAge(int a)
{
	age=a;
}
public int getAge()
{
	return age;
}
public void setGender(String s)
{
	gender=s;
}
public String getGender()
{
	return gender;
}
public void setSalary(int r)
{
	salary=r;
}
public int getSalary()
{
	return salary;
}
}
