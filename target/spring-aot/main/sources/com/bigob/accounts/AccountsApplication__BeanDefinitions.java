package com.bigob.accounts;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AccountsApplication}.
 */
@Generated
public class AccountsApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'accountsApplication'.
   */
  public static BeanDefinition getAccountsApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AccountsApplication.class);
    beanDefinition.setInstanceSupplier(AccountsApplication::new);
    return beanDefinition;
  }
}
