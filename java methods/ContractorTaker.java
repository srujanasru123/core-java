class ContractorTaker{
	public static void main(String[] args)
	{
		Contractor.person();
		System.out.println("\n");
		Contractor.contractor();
		System.out.println("\n");
		Contractor.contractor("ullas");
		System.out.println("\n");
		Contractor.contractor("Srujana",12);
		System.out.println("\n");
		Contractor.contractor("Sru",7, 20000);
		System.out.println("\n");
		Contractor.payment(30000);
		System.out.println("\n");
		Contractor.contractorWork();
		System.out.println("\n");
		Contractor.plan();
		System.out.println("\n");
		Contractor.bid();
		System.out.println("\n");
		Contractor.contractorSupervise();
		System.out.println("\n");
	}
}
