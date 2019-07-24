package com.sinaungoding.crud.jpa;

import com.sinaungoding.crud.jpa.entitas.Mahasiswa;
import com.sinaungoding.crud.jpa.repository.MahasiswaRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Test
    @Ignore
    public void insertTest() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("075410099");
        mahasiswa.setNama("Noprianto");
        mahasiswa.setIpk(3.99F);
        mahasiswa.setJurusan("Teknolog Informasi");
        Mahasiswa save = mahasiswaRepository.save(mahasiswa);
        assertNotNull(save);
    }

    @Test
    public void getMahasiswaByNimTest() {
        Mahasiswa mhs = mahasiswaRepository.findById("075410099").get();
        assertNotNull(mhs);
    }

    @Test
    public void getAllMahasiswaTest() {
        Iterable<Mahasiswa> mahasiswas = mahasiswaRepository.findAll();
        List<Mahasiswa> list = new ArrayList<>();
        for (Mahasiswa mahasiswa : mahasiswas) {
            list.add(mahasiswa);
        }
        assertTrue(!list.isEmpty());
    }

}
