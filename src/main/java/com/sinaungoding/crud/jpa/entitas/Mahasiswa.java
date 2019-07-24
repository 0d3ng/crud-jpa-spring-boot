/*
 * crud-jpa-spring-boot
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/24/19 8:31 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.crud.jpa.entitas;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Mahasiswa {
    @Id
    private String nim;
    private String nama;
    private String jurusan;
    private float ipk;
}
