package com.josemaba.bancamifel.service;

import com.josemaba.bancamifel.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
