package in.co.Test;

import in.co.Bean.UserRregistrationBean;
import in.co.Controller.UserRegistrationCtl;
import in.co.Model.UserRegistrationModel;

public class TestUserRegistration {
	public static void main(String[] args) throws Exception {
		testadd();
	}
	
	private static void testadd() throws Exception {
		UserRregistrationBean bean = new UserRregistrationBean();
		bean.setFname("Raviraj");
		bean.setLname("Verma");
		bean.setGender("Male");
		bean.setEmail("avtar226@gmail.com");
		bean.setContact("7089694123");
		bean.setAdd("Indore");
		bean.setDob("22/06/1995");
		
		UserRegistrationModel model = new UserRegistrationModel();
		
		model.add(bean);
		
		System.out.println("Success");
	}
	
}
