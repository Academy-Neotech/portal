package srl.neotech.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import srl.neotech.model.Stato;

import java.util.List;

@Repository
public class StatoRepository {
    @Autowired
    private NamedParameterJdbcTemplate npjt;

    public List<Stato>get_r_by_stato(){
        MapSqlParameterSource mps=new MapSqlParameterSource();
        String query="select * form stato s order by s.stato_descr";
        return npjt.query(
                query,
                mps,
                ((rs, rowNum) ->new Stato(rs.getString("id"),
                                            rs.getString("stato_descr")))
        );

    }

}
