package com.poc.model.domain;

import com.poc.model.domain.view.ProjectionView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NamedNativeQuery(name = "Customer.findCustomerGroupByCityAndMaxGrade",
        query = "SELECT city, MAX(grade) FROM customer GROUP BY city",
        resultSetMapping = "Mapping.ProjectionView")

@SqlResultSetMapping(name = "Mapping.ProjectionView",
        classes = @ConstructorResult(targetClass = ProjectionView.class,
                columns = {
                        @ColumnResult(name = "city"),
                        @ColumnResult(name = "max")}))

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @Column(name = "customer_id")
    private String id;
    @Column(name = "cust_name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "grade")
    private int grade;
    @Column(name = "salesman_id")
    private int salesmanId;
}
