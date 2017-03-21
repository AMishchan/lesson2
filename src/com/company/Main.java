package com.company;

public class Main {

public static  void main(String[] args) {

	int ageMisha = 41;
	int ageVadim = 32;
	int ageVasya = 23;

if(ageMisha < ageVadim && ageMisha < ageVasya) {

	if (ageVadim < ageVasya) {
		System.out.println("oldest man - " + ageVasya);
		System.out.println("middle man - " + ageVadim);
		System.out.println("youngest man - " + ageMisha);

	}
	if (ageVasya < ageVadim) {
		System.out.println("oldest man - " + ageVadim);
		System.out.println("middle man- " + ageVasya);
		System.out.println("youngest man - " + ageMisha);

	}


}


	if(ageVadim < ageVasya && ageVadim < ageMisha) {

		if (ageVasya < ageMisha) {
			System.out.println("oldest  man - " + ageMisha);
			System.out.println("middle man - " + ageVasya);
			System.out.println("youngest man - " + ageVadim);

		}
		if (ageMisha < ageVasya) {
			System.out.println("oldest man - " + ageVasya);
			System.out.println("middle man - " + ageMisha);
			System.out.println("youngest man - " + ageVadim);

		}


	}


	if(ageVasya < ageVadim && ageVasya < ageMisha) {

		if (ageVadim < ageMisha) {
			System.out.println("oldest man - " + ageMisha);
			System.out.println("middle man - " + ageVadim);
			System.out.println("youngest man- " + ageVasya);

		}
		if (ageMisha < ageVadim) {
			System.out.println("oldest man - " + ageVadim);
			System.out.println("middle man- " + ageMisha);
			System.out.println("youngest man - " + ageVasya);

		}


	}





}
}


