package com.epf.dao;
import com.epf.model.Plante;
import java.util.List;

public interface PlanteDAO {
    // Create a new Plante record
    void createPlante(Plante plante);

    // Retrieve a Plante record by its ID
    Plante getPlanteById(int id);

    // Retrieve all Plante records
    List<Plante> getAllPlantes();

    // Update an existing Plante record
    void updatePlante(Plante plante);

    // Delete a Plante record by its ID
    void deletePlante(int id);
}
