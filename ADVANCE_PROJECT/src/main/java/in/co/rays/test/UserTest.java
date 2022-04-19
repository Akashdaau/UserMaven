package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class UserTest {

	public static void main(String[] args) throws Exception {

		testAdd();
		//testAuth();
		testForgetPwd();

	}

	private static void testAdd() throws Exception {
		UserBean bean = new UserBean();

		SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyy");

		bean.setName("Aksh");
		bean.setLogin("aksh@gmail.com");
		bean.setPassword("123");
		bean.setConfirmPassword("123");
		bean.setDob(sdf.parse("12-11-1996"));
		bean.setMobileNo("1234567890");

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
	
	private static void testForgetPwd() throws Exception
	{
		UserBean bean = new UserBean();
		bean.setLogin("akash@gmail.com");
		
		UserModel model = new UserModel();
		UserBean bean1 = model.forgetPassword(bean);
		
		if(bean!= null)
		{
			System.out.println("Valid Login" + " "+ bean1.getPassword());
			
		}
		else
		{
			System.out.println("Invalid Login");
		}
	}
}
