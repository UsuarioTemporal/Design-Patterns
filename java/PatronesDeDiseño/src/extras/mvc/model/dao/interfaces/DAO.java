/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.model.dao.interfaces;

import java.util.List;

/**
 *
 * @author User
 */
public interface DAO<K,O> {
    List<O> listar();
}
