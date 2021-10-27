package C195.Helper;

import C195.Entities.Country;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This is a helper class to access Countries data
 * @author patrickdenney
 */
public class DBCountries {
    /**
     *
     * @return Returns an ObservableList<Country> of all the countries in the database
     */
    public static ObservableList<Country> getAllCountries(){
        ObservableList<Country> countryList = FXCollections.observableArrayList();
        try{
            String sql = "SELECT * FROM COUNTRIES;";
            PreparedStatement countryPS = JDBC.getConnection().prepareStatement(sql);
            ResultSet results = countryPS.executeQuery();

            while(results.next()){
                int countryID = results.getInt("Country_ID");
                String countryName = results.getString("Country");
                Country country = new Country(countryID, countryName);
                countryList.add(country);
            }

        }
        catch(SQLException throwable){
            throwable.printStackTrace();
        }

        return countryList;
    }


}
