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
public class Service implements IService {

    @Override
    public String executeCommand(String input) {
        return "executeCommand has not yet been implemented";
    }

    @Override
    public String getCrossServiceIdentifier() {
        return toString();
    }
    
    @Override
    public String toString() {
        return "toString has not yet been implemented";
    }
    
}
