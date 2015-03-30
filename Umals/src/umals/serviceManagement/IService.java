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
    
    //These functions are needed for any use of a service to be possible
    public String executeCommand(String input);
    public String getCrossServiceIdentifier();
    
    /*
    These functions are not needed, they are convieniences for the user.  If
    the service extends the Service class
    and only overrides the above commands it will be usable, the below
    functions will be considered unimplemented
    */
    public String setVariable(String name, String value);
    
    
    
}
