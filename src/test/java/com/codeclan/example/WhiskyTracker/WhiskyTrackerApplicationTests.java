package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {
	@Autowired
    WhiskyRepository whiskyRepository;
	@Autowired
	DistilleryRepository distilleryRepository;
	@Test
	public void contextLoads() {
	}
	@Test
	public void findDistilleryById(){
		List<Distillery> dist = distilleryRepository.findDistilleryById(1L);
		assertEquals("Glendronach",dist.get(0).getName());
	}
	@Test
	public void findWhiskyByYear(){
		List<Whisky> whis = whiskyRepository.findWhiskyByYear(2018);
    assertEquals("The Glendronach Revival",whis.get(0).getName());
	}
	@Test
	public void findWhiskyOfParticularDistilleryAge() {
		List<Whisky> whis = whiskyRepository.findWhiskyOfParticularDistilleryAge("Glendronach",12);
     	assertEquals("The Glendronach Original",whis.get(0).getName());
	}

}
