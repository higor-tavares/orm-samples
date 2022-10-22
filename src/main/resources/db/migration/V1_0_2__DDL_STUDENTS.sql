CREATE SEQUENCE IF NOT EXISTS student_id_seq START WITH 1;

CREATE TABLE IF NOT EXISTS students (
    student_id BIGINT NOT NULL DEFAULT NEXTVAL('student_id_seq'),
    name VARCHAR(255),
    birthday DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    registration_number VARCHAR(255) NOT NULL UNIQUE,
    PRIMARY KEY (student_id)
);
-- ASSOCIATION STUDENTS AND COURSES WITH N - N RELATIONSHIP --
CREATE TABLE IF NOT EXISTS course_students (
    course_id BIGINT NOT NULL,
    student_id BIGINT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES courses(course_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    PRIMARY KEY(course_id, student_id)
);
