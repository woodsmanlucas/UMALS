/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umals.serviceManagement;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.openide.util.Lookup;

/**
 *
 * @author Declan Easton
 */
public class ServiceManager {
    
    private Map<String, IService> services;
    
    
    public ServiceManager() {
        Collection<? extends IService> serviceList = Lookup.getDefault().lookupAll(IService.class);
        Iterator<? extends IService> serviceIterator = serviceList.iterator();
        while(serviceIterator.hasNext()) {
            IService service = serviceIterator.next();
            services.put(service.getCrossServiceIdentifier(), service);
        }
    }
    
    public boolean setVariable(String serviceName, String variableName, String value) {
        if(services.containsKey(serviceName)) {
            
        }
        return true;
    }
    
    public static ServiceManager getInstance() {
        return ServiceManagerHolder.INSTANCE;
    }
    
    private static class ServiceManagerHolder {

        private static final ServiceManager INSTANCE = new ServiceManager();
    }
}
