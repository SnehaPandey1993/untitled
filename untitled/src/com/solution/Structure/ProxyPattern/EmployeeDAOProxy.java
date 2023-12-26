package com.solution.Structure.ProxyPattern;

public class EmployeeDAOProxy implements EmployeeDAO{
    private static final boolean ADMIN = false;
    EmployeeDAO empdao;

    public EmployeeDAOProxy(EmployeeDAO empdao) {
        this.empdao = new EmployeeDAOImpl();
    }

    @Override
    public void create() {
        if(ADMIN){
            empdao.create();
        }

    }
}
