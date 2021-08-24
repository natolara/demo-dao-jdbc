package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		System.out.println("====Teste  1 seller findById==========");		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n====Teste  2 seller findByDepartment==========");	
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
		System.out.println("\n====Teste  3 seller findAll==========");	
		
		list = sellerDao.findAll();
		
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}
		
System.out.println("\n====Teste  4 seller insert==========");	
		
		Seller newSeller = new Seller(null, "Greg", "Gre@mail.docm", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = "+ newSeller.getId());
	}

}
