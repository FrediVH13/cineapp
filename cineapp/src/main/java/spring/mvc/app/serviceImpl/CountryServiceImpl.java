package spring.mvc.app.serviceImpl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.app.model.Country;
import spring.mvc.app.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	private List<Country> countryList = null;

	public CountryServiceImpl() {
		countryList = new LinkedList<Country>();
		countryList.add(new Country(1, "EUA", "EUA", true));
		countryList.add(new Country(2, "México", "México", true));
		countryList.add(new Country(3, "España", "España", true));
		countryList.add(new Country(4, "Rusia", "Rusia", true));
	}

	@Override
	public List<Country> getCountryList() {
		return countryList;
	}

	@Override
	public Country getCountry(int id) {
		for (Country c : countryList) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	@Override
	public boolean saveCountry(Country genre) {
		// TODO Auto-generated method stub
		return false;
	}

}
