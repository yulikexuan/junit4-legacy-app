# Spring Boot Application - Migrate from JUnit4 to JUnit5

This source code repository contains JUnit 4 with Maven previously.

## Setup
### Requirements
* Should use Java 11 or higher. Previous versions of Java are un-tested.
* Use Maven 3.5.2 or higher

## Steps for Migrating
- Add JUnit dependency to Maven: 
```
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>${junit-platform.version}</version>
        <scope>test</scope>
    </dependency>
```
- Replace JUnit4 annotations with JUnit5 annotations
  - @Before to @BeforeEach
  - @After to @AfterEach
  - @BeforeClass to @BeforeAll
  - @AfterClass to AfterAll
  - @Ignored to @Disabled
  - @Category to @Tag
  - @RunWith(SpringJUnit4ClassRunner.class) to @ExtendWith(SpringExtension.class)
  - @Test(expected = Foo.class) to @Assertions.assertThrows(FooException.class)
  - @Test(timeout = 1) to @Assertions.assertTimeout(Duration...)
  - @Rule and @ClassRule no longer exist; superseded by @ExtendWith
  
- Replace JUnit4 assertions with JUnit5 or AssertJ
  
- Remove JUnit4 from Spring Boot
  - Excludes JUnit4 from spring-boot-starter-test
```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion> 
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
```