package ph.cpi.rest.api;

import ph.cpi.rest.api.utils.GWEncoder;

public class ClassTester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println(GWEncoder.doEncrypt("CPI12345!"));
		System.out.println(GWEncoder.doEncrypt("CPI12345!"));
		System.out.println(GWEncoder.doEncrypt("CPI12345!"));
		System.out.println(GWEncoder.doEncrypt("CPI12345!"));
		System.out.println(GWEncoder.doEncrypt("CPI12345!"));
		
		System.out.println(GWEncoder.doEncrypt("cpi12345!"));
		System.out.println("------------------------------");
		
		System.out.println(GWEncoder.doEncrypt("PMMSC12345!"));
		System.out.println(GWEncoder.doEncrypt("PMMSC12345!"));
		System.out.println(GWEncoder.doEncrypt("PMMSC12345!"));
	}

}
