package com.espracing.espracingapp.REST;

public class APIUtils {

    // IP
    private static final String server = "80.102.104.105";

    // private static final String server = "192.168.0.12";

    // Puerto
    private static final String port = "27015";
    // IP
    private static final String API_URL = "https://" + server + ":" + port + "/api/";

    private APIUtils() {
    }


    public static UsuariosRest getUsuService() {
        return RetrofitClient.getClient(API_URL).create(UsuariosRest.class);
    }

}