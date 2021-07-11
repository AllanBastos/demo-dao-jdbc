package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n===== Test 1: Department Insert =====");
		Department dep = new Department(null, "Limpeza" );
		departmentDao.insert(dep);
		System.out.println("Id new Departamento: " + dep.getId());

	}

}
