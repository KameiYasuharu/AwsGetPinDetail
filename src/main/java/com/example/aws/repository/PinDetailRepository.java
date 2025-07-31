package com.example.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aws.entity.PinDetail;

public interface PinDetailRepository extends JpaRepository<PinDetail, String> {

	PinDetail findBySbNo(String sbNo);

}