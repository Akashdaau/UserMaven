package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet(urlPatterns = "/forget")
public class ForgetPasswordCtl extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserBean bean = new UserBean();
		
		String login = req.getParameter("login");
		bean.setLogin(login);
		
		UserModel model = new UserModel();
		
		
		try {
			UserBean bean1 = model.forgetPassword(bean);
			
			if (login.equals("")){
				RequestDispatcher rd = req.getRequestDispatcher("ForgetPasswordView.jsp");

				req.setAttribute("err1", "Login is Req...");

				rd.forward(req, resp);
			}
			else {

				if (bean1 != null) {
					RequestDispatcher rd = req.getRequestDispatcher("Forget.jsp");

					req.setAttribute("pwd", bean1.getPassword());

					rd.forward(req, resp);
				} else {

					RequestDispatcher rd = req.getRequestDispatcher("ForgetPasswordView.jsp");

					req.setAttribute("err", "Login is Invalid");

					rd.forward(req, resp);

				}
			}
			
		}
		catch(	Exception e)
		{
			e.printStackTrace();
		}
	}
}