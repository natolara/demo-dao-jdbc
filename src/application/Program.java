package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		System.out.println(obj);

		Seller sl = new Seller(21, "Bob", "Bob@gmail", new Date(), 3000.0, obj);
		System.out.println(sl);
	}

}
