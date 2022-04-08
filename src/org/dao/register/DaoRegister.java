package org.dao.register;

import java.util.List;

import org.modelo.register.Register;

// INTERFACE: NO SE PROGRAMA, SOLO SE AGREAGAN LOS METODOS A IMPLEMENTAR
//EXISTE LA HERENCIA MILTIPLIE? NO, PERO SE PUEDE SIMULAR CON ALS INTERFACES
// extends NameClass 
public interface DaoRegister {
	
	public void addRegister(Register register);
	public List<Register> listRegister();
	public Register getRegisterById(int id);
	public void deleteRegister(int id);
}
