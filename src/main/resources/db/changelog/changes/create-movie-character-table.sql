--liquibase formatted sql
--changeset <Serhii_Buria>:<create-movie-character-table>
CREATE TABLE IF NOT EXISTS public.movie_character
(
    id BIGINT NOT NULL,
    name CHARACTER VARYING(256) NOT NULL,
    status CHARACTER VARYING(256) NOT NULL,
    gender CHARACTER VARYING(256) NOT NULL,
    CONSTRAINT movie_character_pk primary key (id)
);

--rollback DROP TABLE movie_character;