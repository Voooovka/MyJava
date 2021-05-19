package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.models.Plasterer;
import ua.lviv.iot.repository.PlastererRepository;
import java.util.List;

@Service
public class PlastererService {

    private final PlastererRepository plastererRepository;

    @Autowired
    public PlastererService(PlastererRepository plastererRepository){
        this.plastererRepository = plastererRepository;
    }


    public Plasterer findById(Long id){
        return plastererRepository.getOne(id);
    }

    public List<Plasterer> findAll(){
        return plastererRepository.findAll();
    }

    public Plasterer savePlasterer(Plasterer plasterer){
        return plastererRepository.save(plasterer);
    }

    public void deleteById(Long id){
        plastererRepository.deleteById(id);
    }


}
