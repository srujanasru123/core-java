package com.Abstract.app;

public class RoadwaysMaker {
public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("invoking roadwaysrunner in main method");
				Roadways roadways=new RuralRoadways();
				roadways.connectivity();
				roadways.interConnection();
				roadways.economicGrowth();
				roadways.publicService();
				roadways.safety();
				roadways.tourism();
				roadways.trade();
				roadways.transport();
				roadways.travel();
				

			}
	}


