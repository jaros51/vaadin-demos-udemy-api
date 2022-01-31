package com.webmaster.vaadindemos;

import com.webmaster.vaadindemos.rest.User;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UsersService {

    private final WebClient webClient;

    public UsersService(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://jsonplaceholder.typicode.com").build();

    }

    public User[] getUsers(){
        return webClient
                .get()
                .uri("/users")
                .retrieve()
                .bodyToMono(User[].class).block();
    }
}
