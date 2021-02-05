package com.pduarte.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pduarte.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}