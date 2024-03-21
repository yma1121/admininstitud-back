package com.admin.institud.repository;

import com.admin.institud.entity.ContactenosEntity;
import com.admin.institud.entity.ContactenosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactenosRepository extends JpaRepository<ContactenosEntity,Integer> {

}
