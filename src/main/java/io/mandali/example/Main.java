package io.mandali.example;

import io.tubrux.Tubrux;

public class Main {

    public static void main(String[] args) {
        String apikey = "";
        //        String token = "iOiAiSldUIn0.eyJzdWIiOiAiMTIzNDU2Nzg5MC";

        new Tubrux().setShowDate(true)
            .setDetectSensitiveData(true)
            .scan();
    }
}
