package com.bigob.accounts.repository;

import com.bigob.accounts.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link CustomerRepository}.
 */
@Generated
public class CustomerRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public CustomerRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link CustomerRepository#findByMobileNumber(java.lang.String)}.
   */
  public Optional<Customer> findByMobileNumber(String mobileNumber) {
    String queryString = "SELECT c FROM Customer c WHERE c.mobileNumber = :mobileNumber";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("mobileNumber", mobileNumber);

    return Optional.ofNullable((Customer) convertOne(query.getSingleResultOrNull(), false, Customer.class));
  }
}
