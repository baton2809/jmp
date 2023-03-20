package com.epam.jmp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AdRepositoryTest {

    @Autowired
    private AdRepository userRepository;

    @Test
    public void should_create_new_user() {
        AdEntity ad = new AdEntity();
        ad.setName("iphone");
        ad.setPrice(100.0);
        userRepository.save(ad);
        AdEntity userByName = userRepository.findOneByName("iphone");
        assertThat(userByName).isNotNull();
    }

}
