package com.company;

public class Main {

public static  void main(String[] args) {

	int ageMisha = 41;
	int ageVadim = 332;
	int ageVasya = 213;

if(ageMisha < ageVadim && ageMisha < ageVasya) {

	if (ageVadim < ageVasya) {
		System.out.println("oldest man - " + ageVasya", middle man - " + ageVadim",youngest man - " + ageMisha);


	}
	if (ageVasya < ageVadim) {
		System.out.println("oldest man - " + ageVadim", middle man- " + ageVasya", youngest man - " + ageMisha);


	}


}


	if(ageVadim < ageVasya && ageVadim < ageMisha) {

		if (ageVasya < ageMisha) {
			System.out.println("oldest  man - " + ageMisha", middle man - " + ageVasya", youngest man - " + ageVadim);


		}
		if (ageMisha < ageVasya) {
			System.out.println("oldest man - " + ageVasya", middle man - " + ageMisha", youngest man - " + ageVadim);

		}


	}


	if(ageVasya < ageVadim && ageVasya < ageMisha) {

		if (ageVadim < ageMisha) {
			System.out.println("oldest man - " + ageMisha", middle man - " + ageVadim", youngest man- " + ageVasya);


		}
		if (ageMisha < ageVadim) {
			System.out.println("oldest man - " + ageVadim", middle man- " + ageMisha", youngest man - " + ageVasya);

		}


	}





}
}


