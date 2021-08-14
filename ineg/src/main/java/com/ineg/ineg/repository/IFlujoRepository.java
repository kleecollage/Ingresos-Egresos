package com.ineg.ineg.repository;

import com.ineg.ineg.models.Flujo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFlujoRepository extends JpaRepository <Flujo, Long> {
}
