package com.epf.dao;
import com.epf.model.Map;
import java.util.List;

public interface MapDAO {
    // Create a new Map record
    void createMap(Map map);

    // Retrieve a Map record by its ID
    Map getMapById(int id);

    // Retrieve all Map records
    List<Map> getAllMaps();

    // Update an existing Map record
    void updateMap(Map map);

    // Delete a Map record by its ID
    void deleteMap(int id);
}
