package spring.mvc.app.service;

import java.util.List;

import spring.mvc.app.model.Country;

public interface CountryService {
	
	public List<Country> getCountryList();

	public Country getCountry(int id);

	public boolean saveCountry(Country genre);
}
