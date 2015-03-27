/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umals.serviceManagement;

/**
 *
 * @author Declan Easton
 */
public interface IService {
    
    public String executeCommand(String input);
    public String getCrossServiceIdentifier();
    @Override
    public String toString();
    
}
