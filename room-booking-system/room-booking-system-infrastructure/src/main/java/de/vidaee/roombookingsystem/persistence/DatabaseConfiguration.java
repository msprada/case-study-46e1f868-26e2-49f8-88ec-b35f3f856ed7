package de.vidaee.roombookingsystem.persistence;

import org.modelmapper.ModelMapper;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import de.vidaee.roombookingsystem.persistence.services.MappingService;

import java.util.Properties;

import javax.sql.DataSource;

@Configuration()
public class DatabaseConfiguration {

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://localhost:5432/viadee")
                .username("postgres")
                .password("")
                .build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(Environment env) {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(getDataSource());
        factory.setPackagesToScan(new String[] { "de.vidaee.roombookingsystem.persistence.entities" });
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factory.setJpaProperties(additionalProperties());
        return factory;
    }

    @Bean
    public ModelMapper modelMapperBean() {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
        return mapper;
    }

    @Bean
    public MappingService mappingService() {
        return new MappingService();
    }

    private Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.ddl-auto", "update");
        properties.setProperty("jakarta.persistence.schema-generation.create-source=metadata", "true");
        properties.setProperty("jakarta.persistence.schema-generation.scripts.action", "create");
        properties.setProperty("jakarta.persistence.schema-generation.scripts.create-target",
                "create-database-autogen.sql");
        return properties;
    }

}