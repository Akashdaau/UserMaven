package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class UserTest {

	public static void main(String[] args) throws Exception {

		//testAdd();
		testAuth();

	}

	private static void testAdd() throws Exception {
		UserBean bean = new UserBean();

		SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyy");

		bean.setName("Akshay");
		bean.setLogin("akshay@gmail.com");
		bean.setPassword("123");
		bean.setConfirmPassword("123");
		bean.setDob(sdf.parse("12-11-1996"));
		bean.setMobileNo(123456);

		UserModel model = new UserModel();

		model.add(bean);

	}
	
	private static void testAuth() throws Exception {
		
		UserBean bean = new UserBean();
		bean.setLogin("akash@gmail.com");
		bean.setPassword("123");

		UserModel model = new UserModel();
		UserBean bean1 = model.authenticate(bean);

		if (bean1 != null) {
			System.out.println("User Valid");
			System.out.println(bean1.getName());
		} else {
			System.out.println("user Invalid");
		}

	}
}
