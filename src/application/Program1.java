package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Teste  1 department findById ==========");	
		DepartmentDao departamentDao = DaoFactory.createDepartmentDao();
		Department dep = departamentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("====Teste  2 department findAll ==========");
		List<Department> list = departamentDao.findAll();
		for (Department department : list) {
			System.out.println(department);			
		}
		System.out.println("====Teste  3 department Insert ==========");
		Department novoDepartamento = new Department(null, "Fotos");
		departamentDao.insert(novoDepartamento);
		System.out.println("New id: " + novoDepartamento.getId());
		
		System.out.println("====Teste  4 department update ==========");
		Department dep2 = departamentDao.findById(1);
		dep2.setName("Retrato");
		departamentDao.update(dep2);
		System.out.println("Update completo");
		
		System.out.println("====Teste  5 department DeleteById ==========");
		System.out.print("Digiti um id: ");
		int id = sc.nextInt();
		departamentDao.deleteBuId(id);
		System.out.println("Deletado com sucesso");
		
		
	}

}
