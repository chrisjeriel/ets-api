package ph.cpi.rest.api;

import ph.cpi.rest.api.utils.ETSEncoder;

public class ClassTester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		System.out.println(ETSEncoder.doEncrypt("CPI12345!"));
		
		System.out.println(ETSEncoder.doEncrypt("cpi12345!"));
		System.out.println("------------------------------");
		
		System.out.println(ETSEncoder.doEncrypt("PMMSC12345!"));
		System.out.println(ETSEncoder.doEncrypt("PMMSC12345!"));
		System.out.println(ETSEncoder.doEncrypt("PMMSC12345!"));
	}

}
