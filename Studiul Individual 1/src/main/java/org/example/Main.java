package org.example;

import entity.Persoane;
import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();

            TypedQuery<Persoane> findAll = entityManager.createNamedQuery("SelecteazaToatePersoanele", Persoane.class);

            for (Persoane persoane: findAll.getResultList()){
                System.out.println(persoane);
            }

            transaction.commit();
        }finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}