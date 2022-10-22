CREATE SEQUENCE IF NOT EXISTS course_id_seq START WITH 1;

CREATE TABLE IF NOT EXISTS courses (
    course_id BIGINT NOT NULL DEFAULT NEXTVAL('course_id_seq'),
    name VARCHAR(100) NOT NULL,
    duration INT NOT NULL,
    PRIMARY KEY(course_id)
);

CREATE TABLE IF NOT EXISTS course_requirements (
    course_id BIGINT NOT NULL,
    requirement BIGINT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (requirement) REFERENCES courses(course_id),
    PRIMARY KEY (course_id, requirement)
);