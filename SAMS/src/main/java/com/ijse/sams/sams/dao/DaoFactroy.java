package com.ijse.sams.sams.dao;

import com.ijse.sams.sams.dao.custome.IMPL.CourseDaoIMPL;

public class DaoFactroy {
    private static  DaoFactroy daoFactroy;
    private DaoFactroy(){

    }
    public static DaoFactroy getInstance(){
        if(daoFactroy == null){
            daoFactroy = new DaoFactroy();
        }
        return daoFactroy;
    }
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case COURSE -> {
                return new CourseDaoIMPL();
            }
            default -> {
                return null;
            }
        }
    }

    public enum DaoTypes{
        COURSE
    }
}
