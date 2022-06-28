package com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class OpenAccountResponse {
    String accountNumber;
}
