package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Country;
import za.ac.cput.repository.CountryRepository;
import za.ac.cput.service.CountryService;

import java.util.List;
@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository repo;

   @Autowired
   public CountryServiceImpl(CountryRepository repo){this.repo = repo;}

    @Override
    public Country create(Country country){return repo.save(country);}

    @Override
    public Country read (String id){return repo.findById(id).orElse(null);}

    @Override
    public Country update(Country country){
        if (this.repo.existsById(country.getID())){
            return this.repo.save(country);
        }
        return null;
    }

    @Override
    public boolean delete(String id){
        if(this.repo.existsById(id)){
            this.repo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Country> getAll(){return this.repo.findAll();}

}
