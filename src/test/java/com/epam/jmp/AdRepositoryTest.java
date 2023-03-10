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
        AdEntity user = new AdEntity("iphone 14 pro", 1300);
        userRepository.save(user);
        AdEntity userByName = userRepository.findOneByName("iphone 14 pro");
        assertThat(userByName).isNotNull();
    }

}
