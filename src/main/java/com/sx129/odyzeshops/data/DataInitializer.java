package com.sx129.odyzeshops.data;

import com.sx129.odyzeshops.model.User;
import com.sx129.odyzeshops.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    private final UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        createDefaultUserIfNotExists();
    }

    private void createDefaultUserIfNotExists(){
        for(int i = 1; i <= 5; i++){
            String defaultEmail = "user"+i+"@email.com";
            if(userRepository.existsByEmail(defaultEmail)){
                continue;
            }

            User user = new User();
            user.setFirstName("User");
            user.setLastName(String.valueOf(i));
            user.setEmail(defaultEmail);
            user.setPassword("password");
            userRepository.save(user);
            System.out.println("User created: " + user.getEmail());
        }
    }
}
