package com.higortavares.ormsamples.domain.model

import javax.persistence.*

@Entity
@Table(name = "courses")
data class Course (
    @Id
    @SequenceGenerator(sequenceName = "course_id_seq", name = "courseSeq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courseSeq")
    @Column(name="course_id")
    val id: Long?,
    val name: String,
    val duration: Int,
    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(name="course_requirements",
        joinColumns = [JoinColumn(name="course_id")],
        inverseJoinColumns = [JoinColumn(name="requirement")]
    )
    val requirements: List<Course>
)