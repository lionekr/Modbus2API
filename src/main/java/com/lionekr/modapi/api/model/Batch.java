package com.lionekr.modapi.api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Batch {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String callingName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Device device;

}
