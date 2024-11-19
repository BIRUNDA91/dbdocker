package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
public String post(Employee e)
{
	return ed.post(e);
}
public String post(List<Employee> e)
{
	return ed.post(e);
}
public List<Employee> getAll(List<Employee> e)
{
	return ed.getAll();
}
public Employee get(int id)
{
	return ed.get(id);
}
public String put(Employee e)
{
	return ed.put(e);
}
public String delete(int id)
{
	return ed.delete(id);
}
public String patch(int id,Employee e)
{
	return ed.patch(id,e);
}
}
