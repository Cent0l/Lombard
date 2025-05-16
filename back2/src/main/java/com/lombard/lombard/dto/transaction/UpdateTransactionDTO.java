package com.lombard.lombard.dto.transaction;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class UpdateTransactionDTO {
    private LocalDate transactionDate;
    private List<TransactionItemDTO> items;
    private Integer customerId;
}
