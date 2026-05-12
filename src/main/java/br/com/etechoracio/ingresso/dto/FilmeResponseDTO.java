package br.com.etechoracio.ingresso.dto;

import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;


public record FilmeResponseDTO(
    Long id,
    String nome,
    Integer duracao,
    String capa,
    CategoriaFilmeEnum categoria,
    ClassificacaoIndicativaEnum classificacao,
    SimNaoEnum emCartaz,
    String elenco,
    String diretor,
    String descricao,
    Double avaliacao
){ }
