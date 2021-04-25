package ru.geekbrains.patterns.object.relational;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {
    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById(long id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, TITLE, PRICE FROM PRODUCT WHERE ID = ?");
        statement.setLong(1, id);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getLong(1));
                product.setTitle(resultSet.getString(2));
                product.setPrice(resultSet.getInt(3));
                return product;
            }
        }

        throw new RecordNotFoundException(id);
    }
}
