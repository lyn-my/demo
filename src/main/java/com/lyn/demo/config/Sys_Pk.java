package com.lyn.demo.config;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
@Entity
@Data
@Table(name="SYS_PK")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Sys_Pk {
    @Id
    @GenericGenerator( name="id_gen", strategy="enhanced-table",
            parameters = {
                    @Parameter( name = "table_name", value = "SYS_PK"),
                    @Parameter( name = "value_column_name", value = "id_value"),
                    @Parameter( name = "segment_column_name",value = "id_key"),
                    @Parameter( name = "segment_value", value = "t_demo"),
                    @Parameter( name = "increment_size", value = "50"),
                    @Parameter( name = "optimizer",value = "pooled-lo")
            })
    @GeneratedValue(generator="id_gen")
    @Column(name = "id")
    private Long id;
}
