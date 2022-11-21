# Dependency injection
1. **SpringApplication.run**: Creates container that contains beans.
2. **@Component**: Indicates spring boot to create bean/object of this class.This will create bean once even if not calling getBean method.(refer (screenshot:beanCreatedOnce)
3. **context.getBean(Alien.class)**: Initialise object with bean of class mentioned in method.
4. **context.getBean**: Creates bean only once for a particular class.(in singleton prototype))
5. **@Scope**: Creates bean only when required and not automatically. It will create different bean everytime bean is created.
