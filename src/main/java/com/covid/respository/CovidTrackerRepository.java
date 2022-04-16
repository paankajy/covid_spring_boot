package com.covid.respository;

import com.covid.entity.CovidData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CovidTrackerRepository extends JpaRepository<CovidData,Integer> {

    @Query(nativeQuery = true,value = "select * from covid_19_india ci where ci.state = ?1")
    List<CovidData> findByState(String state);
}
