package one_to_one_unidirectional.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import one_to_one_unidirectional.entity.Adhar;
import one_to_one_unidirectional.entity.Person;

public class PersonAdharDao {

	EntityManager em = Persistence.createEntityManagerFactory("hibernate").createEntityManager();

	EntityTransaction et = em.getTransaction();

	
// SAVE ADHAR  AND PERSON DETAILS 	
	public Person savePersonAdharDao(Person person, Adhar adhar) {

		try {
			et.begin();
			em.persist(adhar);
			em.persist(person);
			et.commit();
			return person;

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			return null;
		}

	}

	// SAVE INDIVIDUAL ADHAR DETAILS

	public Adhar saveAdharDao(Adhar adhar)

	{
		try {

			et.begin();
			em.persist(adhar);
			et.commit();
			return adhar;
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}

	}

/// PERSON ADHAR DATA FETCH  
	public Person savePersonAdharDao(Person person, long adharnumber) {

		Adhar adhar = em.find(Adhar.class, adharnumber);

		if (adhar != null) {

			try {

				person.setAdhar(adhar);
				et.begin();
				em.persist(person);
				et.commit();
				return person;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

		else {
			return null;
		}

	}

	public Person getPersonAdharByPersonIdDao(int personid) {
		Person person = em.find(Person.class, personid);

		if (person != null) {
			return person;
		} else {
			return null;
		}

	}

	public boolean deleteAdharByNumberDao(long adharnumber) {

		Adhar adhar = em.find(Adhar.class, adharnumber);

		Query query = em.createNativeQuery("select*from person where adhar_adharno=?", Person.class);
		query.setParameter(1, adharnumber);

		Person person = (Person) query.getSingleResult();

		System.out.println(person);

		if (adhar != null) {

			et.begin();
			person.setAdhar(null);
			em.merge(person);
			em.remove(adhar);
			et.commit();
			return true;
		} else {
			return false;
		}

	}

}
