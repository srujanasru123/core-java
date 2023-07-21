class JobKiller{
	public static void main(String[]values)
	{
		System.out.println("invoking main in JobKiller");
		Job.apply();
		Job.apply("Srujana",6);
		Job.apply("Ullas",8,"Sru");
		Job.apply(5);
		Job.rejectoffer();
	}

}