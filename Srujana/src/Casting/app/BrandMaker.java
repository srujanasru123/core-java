package Casting.app;

public class BrandMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main in BrandRunner");
		
		Brand brand=new Brand();
		LocalBrand loacBrand=new LocalBrand();
		DuplicateBrand duplicateBrand=new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		
		BrandUtil.run(nationalBrand);
		BrandUtil.run(loacBrand);
		BrandUtil.run(internationalBrand);
		BrandUtil.run(duplicateBrand);
	}

}
