/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.inyeccionDeDependecias.dao.interfaz;

import java.util.List;

/**
 *
 * @author User
 */
public interface DAO<K,O> {
    void update(O object);
    void insert(O object);
    void delete(K key);
    List<O> show();
    O showByID(K key);
}
