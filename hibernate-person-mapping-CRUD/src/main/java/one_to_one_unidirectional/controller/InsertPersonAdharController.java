package one_to_one_unidirectional.controller;

import java.time.LocalDate;

import one_to_one_unidirectional.dao.PersonAdharDao;
import one_to_one_unidirectional.entity.Adhar;
import one_to_one_unidirectional.entity.Person;

public class InsertPersonAdharController {

	public static void main(String[] args) {

		
		PersonAdharDao  adharDao = new PersonAdharDao();
		//Adhar adhar = new Adhar( 1234567891011l, "Phines" ,"Auraiya", LocalDate.parse("1989-11-10"));
		
	    //Person person  = new Person(550 ,"ferbs","ferbsgmail.com",899779,adhar);
	    //adharDao.savePersonAdharDao(person, adhar);
		
		adharDao.deleteAdharByNumberDao(1234567891011l);

		
	    
		//Person person = adharDao.getPersonAdharByPersonIdDao(55);
		//System.out.println(person);
		//Adhar adhar = person.getAdhar();
		//System.out.println(adhar);
		
		
		
		
	}

}
