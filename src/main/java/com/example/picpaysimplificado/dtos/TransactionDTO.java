package com.example.picpaysimplificado.dtos;

import java.math.*;

public record TransactionDTO( BigDecimal value, Long senderId, Long receiverId) {
    
}
