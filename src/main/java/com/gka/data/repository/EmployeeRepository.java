package com.gka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JPA :  REPOLAR JPA HİBERNATE SAGLIYACAK ROOT ISLEMLERIMI YAPTIGIMIZ YER
// extends JpaRepository veya CrudRepository
// JpaRepo crud'a gore  daha genıstır
//Repo yapısı aslında bir interface'dir
@Repository
public interface EmployeeRepository extends JpaRepository {
}
