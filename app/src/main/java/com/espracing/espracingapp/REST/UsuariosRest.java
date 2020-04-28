package com.espracing.espracingapp.REST;

import com.espracing.espracingapp.REST.model.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsuariosRest {

    @GET("usuarios")
    Call<List<Usuario>> findAll();
}
