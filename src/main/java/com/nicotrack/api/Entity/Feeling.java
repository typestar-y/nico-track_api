package com.nicotrack.api.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "feelings")
public class Feeling {

    @Transient
    public static final int TYPE_GOOD = 1;
    @Transient
    public static final int TYPE_SO_SO = 2;
    @Transient
    public static final int TYPE_BAD = 3;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter
    @Column(nullable = false)
    private Date date;

    @Getter
    @Column(nullable = false)
    private int type;

    public Feeling(Date date, int type) {
        this.date = date;
        this.type = type;
    }
}
