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
        mahasiswa.setNim("075410100");
        mahasiswa.setNama("Singgih Kuncoro");
        mahasiswa.setIpk(3.50F);
        mahasiswa.setJurusan("Manajemen Informasi");
        Mahasiswa save = mahasiswaRepository.save(mahasiswa);
        assertNotNull(save);
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("075410101");
        mahasiswa.setNama("Singgih Permana");
        mahasiswa.setIpk(3.54F);
        mahasiswa.setJurusan("Teknologi Informasi");
        save = mahasiswaRepository.save(mahasiswa);
        assertNotNull(save);
    }

    @Test
    @Ignore
    public void getMahasiswaByNimTest() {
        Mahasiswa mhs = mahasiswaRepository.findById("075410099").get();
        assertNotNull(mhs);
    }

    @Test
    @Ignore
    public void getAllMahasiswaTest() {
        Iterable<Mahasiswa> mahasiswas = mahasiswaRepository.findAll();
        List<Mahasiswa> list = new ArrayList<>();
        for (Mahasiswa mahasiswa : mahasiswas) {
            list.add(mahasiswa);
        }
        assertTrue(!list.isEmpty());
    }

    @Test
    public void getMahasiswaByNamaLike() {
        List<Mahasiswa> mahasiswas = mahasiswaRepository.findByNamaContaining("Singgih");
        assertTrue(!mahasiswas.isEmpty());
    }

}
