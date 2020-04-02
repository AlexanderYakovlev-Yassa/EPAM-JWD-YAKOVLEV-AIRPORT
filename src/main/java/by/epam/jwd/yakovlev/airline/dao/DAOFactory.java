package by.epam.jwd.yakovlev.airline.dao;

import by.epam.jwd.yakovlev.airline.dao.impl.AircraftDAOImpl;
import by.epam.jwd.yakovlev.airline.dao.impl.EmployeeDAOImpl;

public enum DAOFactory {

    INSTANCE;

    private final EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    private final AircraftDAO aircraftDAO = new AircraftDAOImpl();

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public AircraftDAO getAircraftDAO() {
        return aircraftDAO;
    }
}