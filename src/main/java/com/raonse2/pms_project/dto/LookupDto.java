package com.se2.raonsecure.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LookupDto {
    private String mail_no;
    private String sender_no;
    private String mail_title;
    private String product_no;
    private String send_date;
}
