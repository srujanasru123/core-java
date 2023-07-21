public class Email{
 static String getEmailByName(String personEmail)
 {
  System.out.println("Running main in email");
  if(personEmail != null)
  {
   if(personEmail == "ullas")
   {
    System.out.println("person is: " + personEmail);
    return "ullas@gmail.com";
   }
   if(personEmail == "srujana")
   {
    System.out.println("person is: " + personEmail);
    return "srujana@gmail.com";
   }
   if(personEmail == "sru")
   {
    System.out.println("person is: " + personEmail);
    return "sru@gmail.com";
   }
   if(personEmail == "sanju")
   {
    System.out.println("person is: " + personEmail);
    return "sanju@gmail.com";
   }
   if(personEmail == "adhi")
   {
    System.out.println("person is: " + personEmail);
    return "adhi@gmail.com";
   }
   if(personEmail == "sonu")
   {
    System.out.println("person is: " + personEmail);
    return "sonu@gmail.com";
   }
   if(personEmail == "shobha")
   {
    System.out.println("person is: " + personEmail);
    return "shobha@gmail.com";
   }
   if(personEmail == "raju")
   {
    System.out.println("person is: " + personEmail);
    return "raju@gmail.com";
   }
   if(personEmail == "saanvi")
   {
    System.out.println("person is: " + personEmail);
    return "saanvi@gmail.com";
   }
   if(personEmail == "pavi")
   {
    System.out.println("person is: " + personEmail);
    return "pavi@gmail.com";
   }
   
  }
   else
   {
    System.out.println("Email is not acceptable");
   }
   return "Email";
 }
   
   public static void main(String[] args)
   {
    String ref1 = getEmailByName("ullas");
    System.out.println("email is: " + ref1);
    
    String ref2 = getEmailByName("srujana");
    System.out.println("email is: " + ref1);
    
    String ref3 = getEmailByName("sru");
    System.out.println("email is: " + ref3);
    
    String ref4 = getEmailByName("sanju");
    System.out.println("email is: " + ref4);
    
    String ref5 = getEmailByName("adhi");
    System.out.println("email is: " + ref5);
    
    String ref6 = getEmailByName("sonu");
    System.out.println("email is: " + ref6 );
    
    String ref7 = getEmailByName("shobha");
    System.out.println("email is: " + ref7 );
    
    String ref8 = getEmailByName("raju");
    System.out.println("email is: " + ref8 );
    
    String ref9 = getEmailByName("saanvi");
    System.out.println("email is: " + ref9);
    
    String ref10 = getEmailByName("pavi");
    System.out.println("email is: " + ref10 );
    
   }
}
