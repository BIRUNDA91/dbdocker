package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
public String post(Employee e)
{
	er.save(e);
	return "Posted Successfully";
}
public String post(List<Employee> e)
{
	er.saveAll(e);
	return "PostedAll Successfully";
}
public List<Employee> getAll()
{
	return er.findAll();
}
public Employee get(int id)
{
	return er.findById(id).get();
}
public String put(Employee e)
{
	er.save(e);
	return "updated Successfully";
}
public String delete(int id)
{
	er.deleteById(id);
	return "Deleted Successfully";
}
public String patch(int id,Employee e)
{
	Employee existingdata=er.findById(id).get();
	if(e.getName()!=null && e.getName()!=" ")
	{
		existingdata.setName(e.getName());
	}
	if(e.getAge()!=0)
	{
		existingdata.setAge(e.getAge());
	}
	er.save(existingdata);
	return "Patched successfully";
}
}

