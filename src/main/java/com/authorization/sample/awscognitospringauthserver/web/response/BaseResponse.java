package com.authorization.sample.awscognitospringauthserver.web.response;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BaseResponse {

    private Object data;
    private String message;
    private boolean error = true;

    public BaseResponse(Object data, String message) {
        this.data = data;
        this.message = message;
    }

}
