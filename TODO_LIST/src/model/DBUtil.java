package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("ch21_ex1_email");
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}