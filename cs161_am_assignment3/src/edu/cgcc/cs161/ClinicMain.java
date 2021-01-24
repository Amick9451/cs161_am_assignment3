package edu.cgcc.cs161;

public class ClinicMain {

	public static void main(String[] args) {
		
		Client c = new Client();
		System.out.println(c.getFirstName());
		c.setName("Andrew");
		System.out.println(c.getFirstName());
		
		Referral r = new Referral();
		System.out.println(r.getproviderName());
		r.setproviderName("Spaceship Healthcare");
		System.out.println(r.getproviderName());
		
		Referral_List m = new Referral_List();
		System.out.println(m.getLocation());
		m.setlocation("OuterSpace");
		System.out.println(m.getLocation());
		
		Survey_Questions q = new Survey_Questions();
		System.out.println(q.getQuestionNumber());
		q.setQuestionNumber(222);
		System.out.println(q.getQuestionNumber());
		
		Survey s = new Survey();
		System.out.println(s.getSurveyNumber());
		s.setSurveyNumber(44);
		System.out.println(s.getSurveyNumber());
		
		Service_Need n = new Service_Need();
		System.out.println(n.getServiceNeedDescription());
		n.setServiceNeedDescription("Prescription Refill");
		System.out.println(n.getServiceNeedDescription());
		
		Clinic_Service y = new Clinic_Service();
		System.out.println(y.getServiceName());
		y.setServiceName("Check up");
		System.out.println(y.getServiceName());
		
		Appointment a = new Appointment();
		System.out.println(a.getDate());
		a.setDate("1/24/21");
		System.out.println(a.getDate());
		
		
}
}
