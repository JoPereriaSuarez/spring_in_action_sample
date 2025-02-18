package org.taco_cloud.com.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.taco_cloud.com.demo.domain.entities.Ingredient;

@Repository
class JdbcIngredientRepository implements  IngredientRepository{

    private final JdbcTemplate jdbc;

    public JdbcIngredientRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }
    
    @Override
    public Iterable<Ingredient> findAll() {
        return jdbc.query("select id, name, type from Ingredient", this::map);
    }

    @Override
    public Ingredient findOne(String id) {
        return jdbc.queryForObject("select * from Ingredient where id=?", 
        this::map, id);
    }

    @Override
    public Ingredient save(Ingredient value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
        
    private Ingredient map(ResultSet result, int row) throws SQLException{
        return new Ingredient(
            result.getString("id"),
            result.getString("name"),
            Ingredient.Type.valueOf(result.getString("type")));
    }
}
