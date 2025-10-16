package poketeam.dao;

import java.util.List;

public interface IDAO<T,K> {

	public List<T> findAll();
	public T findById(K id);
	public T save(T obj);
	public void deleteById(K id);
	public void delete(T obj);
	/*
	String urlBdd = "jdbc:mysql://localhost:3306/poketeam";
	String loginBdd = "root";
	String passwordBdd = "root";
	
	public List<T> findAll();
	public T findById(K id);
	public void insert(T obj);
	public void update(T obj);
	public void delete(K id);
	*/
}

