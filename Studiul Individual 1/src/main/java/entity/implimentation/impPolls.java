package entity.implimentation;

import entity.Polls;
import utils.queries.queryOperations;

import java.util.List;

public class impPolls implements impHelper<Polls> {
    @Override
    public List<Polls> findAll() {
        return queryOperations.executeQuery("Polls.All", Polls.class);
    }

    @Override
    public Polls findByID(int id) {
        return null;
    }

    @Override
    public void deleteByID(int id) {

    }

    @Override
    public void insert(List<Polls> elementList) {

    }

    @Override
    public void insert(Polls element) {

    }
}
