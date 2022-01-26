package com.guitarshack;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SmsSender implements Notification {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    @Override
    public void send(String text) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                        new com.twilio.type.PhoneNumber(System.getenv("FROM")),
                        new com.twilio.type.PhoneNumber(System.getenv("TO")),
                        text)
                .create();
    }
}
