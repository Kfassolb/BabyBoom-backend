package com.babyboom.servicesimplement;

import com.babyboom.entities.Medico;
import com.babyboom.repositories.IMedicoRepository;
import com.babyboom.services.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements IMedicoService {
    @Autowired
    private IMedicoRepository medicoRepository;

    @Override
    public void insert(Medico medico) {
        medicoRepository.save(medico);
    }

    @Override
    public List<Medico> list() {
        return medicoRepository.findAll();
    }

    @Override
    public void delete(int idMedico) {
        medicoRepository.deleteById(idMedico);
    }

    @Override
    public Medico listId(int idMedico) {
        return medicoRepository.findById(idMedico).orElse(new Medico());
    }

    @Override
    public List<Medico> listarPorEspecialidad(String especialidad) {return medicoRepository.listarPorEspecialidad(especialidad);}
}
