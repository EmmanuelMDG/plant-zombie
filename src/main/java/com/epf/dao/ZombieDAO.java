package com.epf.dao;
import com.epf.model.Zombie;
import java.util.List;

public interface ZombieDAO {
    // Create a new Zombie record
    void createZombie(Zombie zombie);

    // Retrieve a Zombie record by its ID
    Zombie getZombieById(int id);

    // Retrieve all Zombie records
    List<Zombie> getAllZombies();

    // Retrieve all zombies corresponding to a given map
    List<Zombie> getZombiesByMapId(int idMap);

    // Update an existing Zombie record
    void updateZombie(Zombie zombie);

    // Delete a Zombie record by its ID
    void deleteZombie(int id);
}
