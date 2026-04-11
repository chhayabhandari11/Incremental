package com.edutech.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edutech.progressive.entity.Team;

public class TeamServiceImplJpa  {

    List<Team> list = new ArrayList<>();
    public List<Team> getAllTeam() throws SQLException
    {
           return list;
    }
    public int addTeam(Team team) throws SQLException{
        return -1;
        
    }
    public List<Team> getAllTeamsSortedByName() throws SQLException
    {
         return list;
    }

    public Team getTeamById(int teamId) throws SQLException{
        return null;
    }

    public  void updateTeam(Team team) throws SQLException
    {
    }

    public void deleteTeam(int teamId) throws SQLException
    {

    }

}