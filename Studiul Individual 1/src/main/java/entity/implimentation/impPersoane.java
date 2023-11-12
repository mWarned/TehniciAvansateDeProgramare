package entity.implimentation;

import entity.Persoane;
import entity.Polls;
import entity.Sondaje;
import utils.queries.queryOperations;

import java.util.List;

public class impPersoane implements impHelper<Persoane>{
    @Override
    public List<Persoane> findAll() {
        return queryOperations.useNamedQuery("Persoane.All", Persoane.class);
    }

    @Override
    public Persoane findByID(int id) {
        return null;
    }

    @Override
    public void deleteByID(int id) {
//        queryOperations.useDeleteQueryId(id, Persoane.class);
    }

    @Override
    public void insert(List<Persoane> elementList) {

    }

    @Override
    public void insert(Persoane element) {

    }

    public List<Persoane> findOldest(){
        return queryOperations.useNamedQuery("Persoane.Oldest", Persoane.class);
    }

    public List<Persoane> findYoungest(){
        return queryOperations.useNamedQuery("Persoane.Youngest", Persoane.class);
    }

    public List<Persoane> outputAscendingByBirthday(){
        return queryOperations.useNamedQuery("Persoane.OrderByBirthday", Persoane.class);
    }
}
