package com.lucas.dao;

import com.lucas.entity.Cliente;
import com.lucas.exception.CommitException;
import com.lucas.exception.IdNaoEncontradoException;

public interface ClienteDao {
    void cadastrar(Cliente cliente);

    void atualizar(Cliente cliente) throws IdNaoEncontradoException;

    void remover(int id) throws IdNaoEncontradoException;

    Cliente buscarPorId(int id) throws IdNaoEncontradoException;

    void commit() throws CommitException;
}
