package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Test 1: Department Insert =====");
		Department dep = new Department(null, "Limpeza" );
		departmentDao.insert(dep);
		int id = dep.getId();
		System.out.println("Id new Departamento: " + dep.getId());

		
		System.out.println("\n===== Test 2: Department Update =====");
		dep.setName("Stars");
		departmentDao.update(dep);
		System.out.println("Departamento update to " + dep.getName());
		
		System.out.println("\n===== Test 3: Department findById =====");
		dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n===== Test 4: Department findAll =====");
		List<Department> lista = departmentDao.findAll();
		lista.stream().forEach(System.out::println);
		
		System.out.println("\n===== Test 5: Department deleteById =====");
		departmentDao.deleteById(id);
		lista = departmentDao.findAll();
		lista.stream().forEach(System.out::println);
		
	}

}
