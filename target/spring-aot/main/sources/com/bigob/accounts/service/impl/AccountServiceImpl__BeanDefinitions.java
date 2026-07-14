package com.bigob.accounts.service.impl;

import com.bigob.accounts.repository.AccountRepository;
import com.bigob.accounts.repository.CustomerRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AccountServiceImpl}.
 */
@Generated
public class AccountServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'accountServiceImpl'.
   */
  private static BeanInstanceSupplier<AccountServiceImpl> getAccountServiceImplInstanceSupplier() {
    return BeanInstanceSupplier.<AccountServiceImpl>forConstructor(AccountRepository.class, CustomerRepository.class)
            .withGenerator((registeredBean, args) -> new AccountServiceImpl(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'accountServiceImpl'.
   */
  public static BeanDefinition getAccountServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AccountServiceImpl.class);
    beanDefinition.setInstanceSupplier(getAccountServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
