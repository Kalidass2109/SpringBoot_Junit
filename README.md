

What is Junit ?
=================

=> Free & open source java based framework

=> It is used for unit testing

Note: It is used only for java projects unit testing

========================
What is Unit Testing ?
========================

=> Testing individual components of the application is called as Unit testing.

=> Unit testing is used to identify weather code is working as expected or not.

=> Unit testing is used to identify bugs in the code.

=> With the help of unit testing we can identify bugs at early stage 
  (before giving to testing team).

=> By performing unit testing we can provide quality code 
  (bug free code) to higher environments.

=================================
What is isolated unit testing ?
=================================

=> Controller methods are depends on service methods and service methods depends on dao/repo methods.

=> When we are testing controller method that time only controller method should be executed (service method shouldn't be called).

=> To perform isolated unit testing we will use Mocking.

===================
What is Mocking ?
===================

=> The process of creating substitute object for real-object is called as Mocking.

=> To perform mocking we have several mocking frameworks

			a) Mockito
			b) Easy Mock
			c) Power Mock
			d) JMock

========================
What is code coverage ?	
========================

=> The process of identifying which lines of code is unit tested and which lines of code is missed in unit testing.

=> Industry standard is minimum 80% code coverage for the project.

=> To get code coverage report we can use 'jacocco' plugin.

====================================
Unit Testing for Boot application
====================================

=> Spring Boot provided 'spring-boot-starter-test' dependency to perform unit testing.

Note: This dependency will be added by default when we create boot application.


===============================================
SpringBoot Rest API + Junit + Mocking + Jacoco
===============================================

https://github.com/ashokitschool/sb_rest_api_junit_app.git


@WebMvcTest - this will be used only in rest controller class
@MockBean
@InjectMocks
@Test
@SpringBootTest - this will be used all classes except rest controller 
@ExtendWith


=====================================================
Q) How to perform unit testing for private methods ?
=====================================================
