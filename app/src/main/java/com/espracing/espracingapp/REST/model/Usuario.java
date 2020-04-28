package com.espracing.espracingapp.REST.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

    @SerializedName("id")
    @Expose
    private long id;

    @SerializedName("alias")
    @Expose
    private String alias;

    @SerializedName("correo")
    @Expose
    private String correo;

    @SerializedName("steamid")
    @Expose
    private String steamid;

    @SerializedName("passwd")
    @Expose
    private String passwd;

    @SerializedName("foto")
    @Expose
    private String foto;

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("categoria")
    @Expose
    private int categoria;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSteamid() {
        return steamid;
    }

    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", correo='" + correo + '\'' +
                ", steamid='" + steamid + '\'' +
                ", passwd='" + passwd + '\'' +
                ", foto='" + foto + '\'' +
                ", token='" + token + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
