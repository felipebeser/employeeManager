package br.com.beserdev.employeemanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.beserdev.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Optional<Employee> findEmployeeById(Long id);

	void deleteEmployeeById(long id);

}
