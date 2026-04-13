package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Cricketer;
import com.edutech.progressive.repository.CricketerRepository;
import com.edutech.progressive.service.CricketerService;

@Service
public class CricketerServiceImplJpa  implements CricketerService  {

    @Autowired
    CricketerRepository cricketerRepository;
    
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }

    List<Cricketer> list= new ArrayList<>();
    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
       return list;
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
       return -1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        return list;
    }
     public void updateCricketer(Cricketer cricketer) throws SQLException{

    
     }

    public void deleteCricketer(int cricketerId) throws SQLException{

    }

    public Cricketer getCricketerById(int cricketerId)throws SQLException {
        return null;
    }

    //Do not implement these methods in CricketerServiceImplArraylist.java and CricketerServiceImplJdbc.java class
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException {
        return null;
    }



}