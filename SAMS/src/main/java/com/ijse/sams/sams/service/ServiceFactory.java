package com.ijse.sams.sams.service;

import com.ijse.sams.sams.service.coustome.CourseService;
import com.ijse.sams.sams.service.coustome.CourseServiceIMPL;

public class ServiceFactory implements SuperService{
    private static   ServiceFactory serviceFactory;

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    public CourseService getServiceFactory(ServiceType  serviceType){
        switch (serviceType){
            case COURSE ->
            {
                return new CourseServiceIMPL();
            }
        }
        return null;
    }
    public enum ServiceType{
        COURSE
    }
}
