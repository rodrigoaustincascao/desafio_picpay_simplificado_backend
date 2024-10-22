package com.example.picpaysimplificado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.picpaysimplificado.domain.user.User;
import com.example.picpaysimplificado.dtos.NotificationRequestDTO;

@Service
public class NotificationService {
    
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception{
        String email = user.getEmail();

        NotificationRequestDTO notificationRequest = new NotificationRequestDTO(email, message);
        ResponseEntity<String> notificationResponse =  restTemplate.postForEntity("https://util.devi.tools/api/v2/notify", notificationRequest, String.class);

        if(!(notificationResponse.getStatusCode() == HttpStatus.NO_CONTENT)){
            System.out.println("Erro ao enviar a notificação");
            throw new Exception("Serviço de notificação está fora do ar");      
            
        }
    }
}
