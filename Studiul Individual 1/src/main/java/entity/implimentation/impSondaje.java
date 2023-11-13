package entity.implimentation;

import entity.Sondaje;
import utils.queries.queryOperations;

import java.util.List;

public class impSondaje implements impHelper<Sondaje>{
    @Override
    public List<Sondaje> findAll() {
        return queryOperations.executeQuery("Sondaje.All", Sondaje.class);
    }

    @Override
    public Sondaje findByID(int id) {
        return null;
    }

    @Override
    public void deleteByID(int id) {

    }

    @Override
    public void insert(List<Sondaje> elementList) {

    }

    @Override
    public void insert(Sondaje element) {

    }
}
