package com.rica.investigadoresservice.investigadores.aplicacion;

import com.rica.investigadoresservice.investigadores.dominio.Investigador;

import java.util.List;

public interface InvestigadorUseCase {

    List<Investigador> listarTodos();

    Investigador buscarPorId(Long id);

    boolean existePorCorreo(String correoInstitucional);

    Investigador registrar(
            String nombreCompleto,
            String correoInstitucional,
            String grupoInvestigacion
    );
}