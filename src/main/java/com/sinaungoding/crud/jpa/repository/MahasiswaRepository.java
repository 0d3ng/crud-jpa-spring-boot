/*
 * crud-jpa-spring-boot
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/24/19 9:42 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.crud.jpa.repository;

import com.sinaungoding.crud.jpa.entitas.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, String> {
}
