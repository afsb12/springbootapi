package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.StatusTopico;

import java.time.LocalDateTime;

public class DetalhesTopicoDto {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;

}
