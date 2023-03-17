package come.crud.repository;


import org.springframework.stereotype.Repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import come.crud.model.Student;

@Repository
public interface RegistrationRepository extends  R2dbcRepository<Student, String>{


}