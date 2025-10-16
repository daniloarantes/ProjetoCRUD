/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author danilo
 */
public class Usuario {

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
    private String senhaHash;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senha) {
        this.senhaHash = encoder.encode(senha);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para validação de senha
    public boolean verificarSenha(String senhaDigitada) {
        return encoder.matches(senhaDigitada, this.senha);
    }

}
