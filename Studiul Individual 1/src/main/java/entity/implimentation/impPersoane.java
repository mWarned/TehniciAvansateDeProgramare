package entity.implimentation;

import entity.Persoane;
import jakarta.persistence.*;
import utils.queries.queryOperations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class impPersoane implements impHelper<Persoane>{
    @Override
    public List<Persoane> findAll() {
        return queryOperations.executeQuery("Persoane.All", Persoane.class);
    }

    @Override
    public Persoane findByID(int id) {
        return queryOperations.findById(id, Persoane.class);
    }

    @Override
    public void deleteByID(int id) {
        queryOperations.deleteById(id, Persoane.class);
    }

    @Override
    public void insert(List<Persoane> elementList) {

    }

    @Override
    public void insert(Persoane element) {

    }

    public List<Persoane> findOldest(){
        return queryOperations.executeQuery("Persoane.Oldest", Persoane.class);
    }

    public List<Persoane> findYoungest(){
        return queryOperations.executeQuery("Persoane.Youngest", Persoane.class);
    }

    public List<Persoane> outputAscendingByBirthday(){
        return queryOperations.executeQuery("Persoane.OrderByBirthday", Persoane.class);
    }

    public List<Persoane> outputPeopleInAgeRange(int age1, int age2){
        LocalDate currentDate = LocalDate.now();
        LocalDate startDate = currentDate.minusYears(age1);
        LocalDate endDate = currentDate.minusYears(age2);

        System.out.println(startDate + " " + endDate);

        return  queryOperations.twoParametersQuery("Persoane.AgeRange", startDate, endDate, Persoane.class);
    }
    public Float divorcePercentage(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Float entityList;

        try {
            transaction.begin();

            TypedQuery<Persoane> namedQuerry = entityManager.createNamedQuery("Persoane.DivortatPercentage", Persoane.class);
            entityList = (float) namedQuerry.getFirstResult();

            transaction.commit();
        }finally {
            if(transaction.isActive()) transaction.rollback();
            entityManager.clear();
            entityManagerFactory.close();
        }
        return entityList;
    }
}
