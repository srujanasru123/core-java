package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.ArtistRepository;
import com.xworkz.Repository.app.GroceryRepository;
import com.xworkz.Repository.app.HistoricalRepository;
import com.xworkz.Repository.app.MedicineRepository;
import com.xworkz.Repository.app.PatientRepository;
import com.xworkz.Repository.app.PilotRepository;
import com.xworkz.Repository.app.PoliticianRepository;
import com.xworkz.Repository.app.impl.ArtistRepositoryImpl;
import com.xworkz.Repository.app.impl.GroceryRepositoryImpl;
import com.xworkz.Repository.app.impl.MedicineRepositoryImpl;
import com.xworkz.Repository.app.impl.PatientRepositoryImpl;
import com.xworkz.Repository.app.impl.PilotRepositoryImpl;
import com.xworkz.Repository.app.impl.PoliticianRepositoryImpl;
import com.xworkz.Repository.app.service.ArtistServiceImpl;
import com.xworkz.Repository.app.service.GroceryService;
import com.xworkz.Repository.app.service.GroceryServiceImpl;
import com.xworkz.Repository.app.service.HistoricalService;
import com.xworkz.Repository.app.service.HistoricalServiceImpl;
import com.xworkz.Repository.app.service.MedicineService;
import com.xworkz.Repository.app.service.MedicineServiceImpl;
import com.xworkz.Repository.app.service.PatientService;
import com.xworkz.Repository.app.service.PatientServiceImpl;
import com.xworkz.Repository.app.service.PilotService;
import com.xworkz.Repository.app.service.PilotServiceImpl;
import com.xworkz.Repository.app.service.PoliticianService;

public class AllMainRunner {

	public static void main(String[] args) {
	
			System.out.println("\n");
			System.out.println("----------------------GROCERY-SERVICE-----------");
			System.out.println("\n");

			GroceryRepository groceryRepository=new GroceryRepositoryImpl();

			GroceryService service=new GroceryServiceImpl(groceryRepository);
			service.save("Sugar");
			service.save("Chilli");
			service.save("Milk Powder");
			service.save("Oil");
			service.save("Toothpaste");
			service.save("Detergent");
			service.save("Chicken Masala Powder");
			service.save("Matton Masala Powder");
			service.save("Rasam Powder");
			service.save("Egg");
			service.save("Sugar");

			System.out.println("\n");
			System.out.println("----------------------ARTIST-SERVICE-----------");
			System.out.println("\n");

			ArtistRepository artistRepository=new ArtistRepositoryImpl();

			ArtistService artist=new ArtistServiceImpl(artistRepository);
			artist.list("Amrita Sher-Gil");
			artist.list("Jamini Roy");
			artist.list("Kalipada Goshala");
			artist.list("Maniam");
			artist.list("Manishi Dey");
			artist.list("Nandalal Bose");
			artist.list("Rabindranath Tagore");
			artist.list("Silpi");
			artist.list("Sunil Das");
			artist.list("Thakur Singh");
			artist.list("Thakur Singh");

			System.out.println("\n");
			System.out.println("----------------------HISTORICAL PLACES-SERVICE-----------");
			System.out.println("\n");

			HistoricalRepository historicalPlacesRepository=new HistoricalRepository();

			HistoricalService place=new HistoricalServiceImpl(historicalPlacesRepository);

			place.venue("Mysore");
			place.venue("Badami");
			place.venue("Aihole");
			place.venue("Halebidu");
			place.venue("Shimoga");
			place.venue("Dandeli");
			place.venue("Hampi");
			place.venue("Srirangapatna");
			place.venue("Banglore");
			place.venue("Beluru");
			place.venue("Mysore");

			System.out.println("\n");
			System.out.println("-------------------MEDICINE-SERVICE-------------------");
			System.out.println("\n");

			MedicineRepository medicineRepository=new MedicineRepositoryImpl();

			MedicineService medicine=new MedicineServiceImpl(medicineRepository); 
			medicine.list("Naproxen");
			medicine.list("Aspirin");
			medicine.list("Diazepen");
			medicine.list("Ativan");
			medicine.list("Dolo-650");
			medicine.list("Lisinopril");
			medicine.list("Dexamenthose");
			medicine.list("Atvin");
			medicine.list("Doxycycline");
			medicine.list("sinarest");
			medicine.list("Naproxen");
			medicine.list("Abacavir");

			System.out.println("\n");
			System.out.println("-------------------PATIENT-------------------");
			System.out.println("\n");



			PatientRepository patientRepository=new PatientRepositoryImpl();

			PatientService patient=new PatientServiceImpl(patientRepository);
			patient.care("ullas");
			patient.care("srujana");
			patient.care("sona");
			patient.care("sanju");
			patient.care("shobha");
			patient.care("raju");
			patient.care("sumanth");
			patient.care("anitha");
			patient.care("sushmitha");
			patient.care("kumar");
			patient.care("arpitha");
			patient.care(null);

			System.out.println("\n");
			System.out.println("-------------------POLITICIAN-SERVICE-------------------");
			System.out.println("\n");


			PoliticianRepository politicianRepository=new PoliticianRepositoryImpl();

			PoliticianService politician=new PoliticianService(politicianRepository);
			politician.list("Narendra Modi");
			politician.list("B S Y");
			politician.list("Halappa Achar");
			politician.list("Karadi Sanganna");
			politician.list("R Ashoka");
			politician.list("B N Bache Gowda");
			politician.list("G S Basavaraj");
			politician.list("K G Bopaiah");
			politician.list("Basavaraj Bommai");
			politician.list("C K Ramamurthy");
			politician.list("B S Y");
			politician.list(null);

			System.out.println("\n");
			System.out.println("-------------------PILOT-SERVICE-------------------");
			System.out.println("\n");

			PilotRepository pilotRepository=new PilotRepositoryImpl();

			PilotService pilot=new PilotServiceImpl(pilotRepository);

			pilot.list("Ajay");
			pilot.list("Suhas Biswas");
			pilot.list("cariappa");
			pilot.list("Anil Chopra");
			pilot.list("Rana Chinna");
			pilot.list("Vinod");
			pilot.list("Srujan Das");
			pilot.list("Divakar");
			pilot.list("Kumar");
			pilot.list("Anna malie");
			pilot.list("Roman Vishal");
			pilot.list(null);

		}

	}


