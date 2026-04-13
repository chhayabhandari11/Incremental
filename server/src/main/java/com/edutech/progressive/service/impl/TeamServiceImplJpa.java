package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Team;
import com.edutech.progressive.repository.TeamRepository;
import com.edutech.progressive.service.TeamService;

@Service
public class TeamServiceImplJpa implements TeamService  {

    List<Team> list = new ArrayList<>();
    @Autowired
    TeamRepository teamRepository;
    
    

    public TeamServiceImplJpa(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
  
    public int addTeam(Team team) throws SQLException{
        Team team2 =  teamRepository.save(team);;
        return team2.getTeamId();        
    }
    public List<Team> getAllTeamsSortedByName() throws SQLException
    {
         List<Team> list= new ArrayList<>(teamRepository.findAll());
         Collections.sort(list);
         return list;
    }

    public Team getTeamById(int teamId) throws SQLException{
        return teamRepository.findByTeamId(teamId);
    }

    public  void updateTeam(int teamId, Team team) throws SQLException
    {
        Team t= teamRepository.findById(teamId).orElse(null);
        t.setTeamName(team.getTeamName());
        t.setLocation(team.getLocation());
        t.setOwnerName(team.getOwnerName());
        t.setEstablishmentYear(team.getEstablishmentYear());
        teamRepository.save(t);
        

    }

    public void deleteTeam(int teamId) throws SQLException
    {
        teamRepository.deleteById(teamId);
    }
    @Override
    public List<Team> getAllTeams() throws SQLException {
       return  teamRepository.findAll();
    }
  
    

}